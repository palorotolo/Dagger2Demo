package me.palorotolo.dagger2demo;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import javax.inject.Inject;

import me.palorotolo.dagger2demo.utils.UtilsViewHolder;

/**
 * Created by yao on 2017/2/2.
 */

public class UserAdapter extends BaseAdapter{

    private final List<String> strings;

    @Inject
    public UserAdapter(List<String> strings) {
        this.strings = strings;
    }

    @Override
    public int getCount() {
        return strings.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        UtilsViewHolder holder = UtilsViewHolder
                        .create(view, viewGroup, android.R.layout.simple_list_item_1);
        TextView textView = holder.getTextView(android.R.id.text1);
        textView.setText(strings.get(i));
        return holder.convertView;
    }
}
