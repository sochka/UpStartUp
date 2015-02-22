package qsoft.upstartup.app.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import jp.wasabeef.picasso.transformations.CropCircleTransformation;
import qsoft.upstartup.app.R;
import qsoft.upstartup.app.rest.UpUser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andrii on 08.02.15.
 */
public class UpUsersAdapter extends ArrayAdapter<UpUser> {

    private List<UpUser> users;
    private Context context;
    private int layoutResourceId;

    public UpUsersAdapter(Context context, int layoutResourceId, List<UpUser> users) {
        super(context, layoutResourceId, users);
        this.context = context;
        this.users = users;
        this.layoutResourceId = layoutResourceId;
    }

    public void setData(List<UpUser> l) {
        users = new ArrayList<UpUser>(l);
        this.notifyDataSetChanged();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;
        if (v == null) {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            v = inflater.inflate(layoutResourceId, null, false);
        }

        final UpUser user = getItem(position);
        TextView tvName = (TextView) v.findViewById(R.id.tv_participant_item_name);
        final ImageView ivPicture = (ImageView) v.findViewById(R.id.iv_participant_item_photo);

        Picasso.with(context)
                .load(user.getImage())
                .fit()
                .transform(new CropCircleTransformation())
                .into(ivPicture);

        tvName.setText(user.getName());

        return v;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public UpUser getItem(int position) {
        return users.get(position);
    }
}
