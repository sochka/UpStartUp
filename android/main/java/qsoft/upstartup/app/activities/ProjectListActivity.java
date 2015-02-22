package qsoft.upstartup.app.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import qsoft.upstartup.app.R;
import qsoft.upstartup.app.adapters.ListAdapter;
import qsoft.upstartup.app.rest.UpListProject;
import qsoft.upstartup.app.utils.Utils;

import java.util.ArrayList;

/**
 * Created by andrii on 21.02.15.
 */
public class ProjectListActivity extends ActionBarActivity implements AdapterView.OnItemClickListener {

    private ListView lvProjects;
    private ListAdapter listAdapter;
    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        if (mToolbar != null) {
            setSupportActionBar(mToolbar);
        }

        Utils.addUsers();
        Utils.addProjects();

        initViews();
        setupViews();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mToolbar.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
    }

    private void initViews() {
        lvProjects = (ListView) findViewById(R.id.lv_projects);
    }

    private void setupViews() {
        ArrayList<UpListProject> list = Utils.getUpListProjects();
//        ArrayList<UpListProject> list = new ArrayList<>();
//        list.add(new UpListProject("0", "Title", "Type of project", "http://www.medicalnewstoday.com/content/categories/psychology-psychiatry/thumbs/image3.jpg", "2"));
        listAdapter = new ListAdapter(list);
        lvProjects.setAdapter(listAdapter);
        lvProjects.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(ProjectListActivity.this, MainActivity.class);
        intent.putExtra("id", listAdapter.getItem(position).getId());
        startActivity(intent);
    }


}
