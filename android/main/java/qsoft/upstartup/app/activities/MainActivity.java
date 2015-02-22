package qsoft.upstartup.app.activities;

import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.InjectViews;
import butterknife.OnClick;
import com.manuelpeinado.fadingactionbar.view.ObservableScrollable;
import com.manuelpeinado.fadingactionbar.view.OnScrollChangedCallback;
import com.readystatesoftware.systembartint.SystemBarTintManager;
import com.squareup.picasso.Picasso;
import jp.wasabeef.picasso.transformations.CropCircleTransformation;
import qsoft.upstartup.app.R;
import qsoft.upstartup.app.rest.UpProject;
import qsoft.upstartup.app.utils.Utils;

import java.util.List;


public class MainActivity extends ActionBarActivity implements OnScrollChangedCallback {

    private Toolbar mToolbar;
    private Drawable mActionBarBackgroundDrawable;
    private SystemBarTintManager mStatusBarManager;
    private int mInitialStatusBarColor;
    private int mFinalStatusBarColor;
    private ImageView mHeader;
    private int mLastDampedScroll;

    @InjectViews({R.id.tv1, R.id.tv2, R.id.tv4, R.id.tv13, R.id.tv14})
    List<TextView> headers;

    @InjectViews({R.id.tv_project_problem, R.id.tv_project_idea, R.id.tv_project_description,
            R.id.tv_project_risks, R.id.tv_project_team})
    List<TextView> bodies;
    private UpProject p;

    @InjectView(R.id.header)
    ImageView image;

    @InjectView(R.id.imageView)
    ImageView userImage;
    @InjectView(R.id.textView)
    TextView moreUsers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);

        setTypeface();
        p = Utils.getUpProjects().get(Integer.parseInt(getIntent().getStringExtra("id")) - 1);
        setupProject();

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        if (mToolbar != null) {
            setSupportActionBar(mToolbar);
            mActionBarBackgroundDrawable = mToolbar.getBackground();
        }

        mStatusBarManager = new SystemBarTintManager(this);
        mStatusBarManager.setStatusBarTintEnabled(true);
        mInitialStatusBarColor = Color.BLACK;
        mFinalStatusBarColor = getResources().getColor(R.color.primary_dark_material_dark);

        mHeader = (ImageView) findViewById(R.id.header);
        mHeader.setImageResource(R.drawable.ic_launcher);

        ObservableScrollable scrollView = (ObservableScrollable) findViewById(R.id.scrollview);
        scrollView.setOnScrollChangedCallback(this);

        onScroll(-1, 0);
    }

    private void setupProject() {
        bodies.get(0).setText(p.getProblem());
        bodies.get(1).setText(p.getIdea());
        bodies.get(2).setText(p.getDescriptions());
        bodies.get(3).setText("Investor part 15%.\nGeneral price: 100 000$\nPrice in one year: 230 000$");
        bodies.get(4).setText(p.getTeam().get(0).getName()+"\n"+p.getTeam().get(0).getPosition());
        Picasso.with(this)
                .load(p.getImage())
                .fit()
                .centerCrop()
                .into(image);
        Picasso.with(this)
                .load(p.getTeam().get(0).getImage())
                .fit()
                .transform(new CropCircleTransformation())
                .into(userImage);
        moreUsers.setText("..and "+p.getTeam().size()+" members");
    }

    @OnClick(R.id.textView)
    void onClick() {
        Intent intent = new Intent(this, UpUsersActivity.class);
        intent.putExtra("id", Integer.parseInt(p.getId())-1);
        startActivity(intent);
    }

    private void setTypeface() {
        Typeface type = Typeface.createFromAsset(getAssets(), "Roboto-Light.ttf");
        Typeface type1 = Typeface.createFromAsset(getAssets(), "Roboto-Regular.ttf");
        for (TextView header : headers) {
            header.setTypeface(type1);
            header.setText(header.getText().toString().toUpperCase());
        }
        for (TextView body : bodies) {
            body.setTypeface(type);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onScroll(int l, int scrollPosition) {
        int headerHeight = mHeader.getHeight() - mToolbar.getHeight();
        float ratio = 0;
        if (scrollPosition > 0 && headerHeight > 0)
            ratio = (float) Math.min(Math.max(scrollPosition, 0), headerHeight) / headerHeight;

        updateActionBarTransparency(ratio);
        updateStatusBarColor(ratio);
        updateParallaxEffect(scrollPosition);
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    private void updateActionBarTransparency(float scrollRatio) {
        int newAlpha = (int) (scrollRatio * 255);
        mActionBarBackgroundDrawable.setAlpha(newAlpha);
        mToolbar.setBackground(mActionBarBackgroundDrawable);
    }

    private void updateStatusBarColor(float scrollRatio) {
        int r = interpolate(Color.red(mInitialStatusBarColor), Color.red(mFinalStatusBarColor), 1 - scrollRatio);
        int g = interpolate(Color.green(mInitialStatusBarColor), Color.green(mFinalStatusBarColor), 1 - scrollRatio);
        int b = interpolate(Color.blue(mInitialStatusBarColor), Color.blue(mFinalStatusBarColor), 1 - scrollRatio);
        mStatusBarManager.setTintColor(Color.rgb(r, g, b));
    }

    private void updateParallaxEffect(int scrollPosition) {
        float damping = 0.5f;
        int dampedScroll = (int) (scrollPosition * damping);
        int offset = mLastDampedScroll - dampedScroll;
        mHeader.offsetTopAndBottom(-offset);

        mLastDampedScroll = dampedScroll;
    }

    private int interpolate(int from, int to, float param) {
        return (int) (from * param + to * (1 - param));
    }
}
