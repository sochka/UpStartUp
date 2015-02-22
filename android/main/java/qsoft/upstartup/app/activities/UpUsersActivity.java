package qsoft.upstartup.app.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;
import qsoft.upstartup.app.R;
import qsoft.upstartup.app.adapters.UpUsersAdapter;
import qsoft.upstartup.app.rest.UpUser;
import qsoft.upstartup.app.utils.Utils;

import java.util.ArrayList;

/**
 * Created by andrii on 22.02.15.
 */
public class UpUsersActivity extends ActionBarActivity {

    private Toolbar mToolbar;

    private ListView lvUsers;
    private UpUsersAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_participants);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        if (mToolbar != null) {
            setSupportActionBar(mToolbar);
        }

        initViews();
        setupViews();
    }

    private void initViews() {
        lvUsers = (ListView) findViewById(R.id.lv_participants);
    }

    private void setupViews() {
        Intent intent = getIntent();
        int pos = intent.getIntExtra("id", -1);
        if (pos != -1) {
            adapter = new UpUsersAdapter(
                    UpUsersActivity.this, R.layout.item_participant, Utils.getUpProjects().get(pos).getTeam());

        } else {
            adapter = new UpUsersAdapter(
                    UpUsersActivity.this, R.layout.item_participant, new ArrayList<UpUser>());
        }
        lvUsers.setAdapter(adapter);
    }

}
