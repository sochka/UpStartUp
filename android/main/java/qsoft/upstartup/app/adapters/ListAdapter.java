package qsoft.upstartup.app.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import jp.wasabeef.picasso.transformations.CropCircleTransformation;
import qsoft.upstartup.app.R;
import qsoft.upstartup.app.rest.UpListProject;

import java.util.ArrayList;

/**
 * Created by p_val on 21.02.15.
 */
public class ListAdapter extends BaseAdapter {

    private final ArrayList<UpListProject> list;

    public ListAdapter(ArrayList<UpListProject> list) {
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public UpListProject getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        UpListProject item = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.imageView = (ImageView) convertView.findViewById(R.id.icon);
            viewHolder.followers = (TextView) convertView.findViewById(R.id.followers);
            viewHolder.title = (TextView) convertView.findViewById(R.id.name);
            viewHolder.type = (TextView) convertView.findViewById(R.id.type);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        if (item != null) {
            Picasso.with(convertView.getContext())
                    .load(item.getImage())
                    .fit()
                    .transform(new CropCircleTransformation())
                    .into(viewHolder.imageView);
            viewHolder.type.setText(item.getType());
            viewHolder.title.setText(item.getTitle());
            viewHolder.followers.setText(item.getFollowers());
        }

        return convertView;
    }

    static class ViewHolder {
        ImageView imageView;
        TextView title;
        TextView type;
        TextView followers;
    }
}
