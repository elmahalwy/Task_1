package com.example.elkholy.task_1;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

/**
 * Created by elkholy on 04/02/2017.
 */

public class Expandble_list_adapter extends BaseExpandableListAdapter {
    private Context context;
    private List<group> list_Header;
    private HashMap<List<group>, List<Items>> list_Child;

    public Expandble_list_adapter(Context context, List<group> list_Header, HashMap<List<group>, List<Items>> list_Child) {
        this.context = context;
        this.list_Header = list_Header;
        this.list_Child = list_Child;
    }

    @Override
    public void registerDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public int getGroupCount() {
        return this.list_Header.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {

          return this.list_Child.get(this.list_Header.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return list_Header.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return this.list_Child.get(this.list_Header.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        group group = (group) getGroup(groupPosition);
        //String HeaderTitle = (String) getGroup(groupPosition);

        LayoutInflater layoutInflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = layoutInflater.inflate(R.layout.list_group, null);

        TextView tv_group_name = (TextView) convertView.findViewById(R.id.tv_group_name);
        tv_group_name.setText(group.name);

        ImageView imageView = (ImageView) convertView.findViewById(R.id.img_group);
        imageView.setImageResource(group.imagurl);
       // tv_group_name.setText(HeaderTitle);

        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        Items item = (Items) getChild(groupPosition, childPosition);
        LayoutInflater layoutInflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = layoutInflater.inflate(R.layout.list_item, null);

        TextView tv_item_name = (TextView) convertView.findViewById(R.id.tv_item_name);
        tv_item_name.setText(item.name);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView3);
        imageView.setImageResource(item.imagurl);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }

    @Override
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void onGroupExpanded(int groupPosition) {

    }

    @Override
    public void onGroupCollapsed(int groupPosition) {

    }

    @Override
    public long getCombinedChildId(long groupId, long childId) {
        return 0;
    }

    @Override
    public long getCombinedGroupId(long groupId) {
        return 0;
    }
}
