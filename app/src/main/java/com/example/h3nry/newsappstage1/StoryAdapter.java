package com.example.h3nry.newsappstage1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

public class StoryAdapter extends ArrayAdapter<Story> {

    public StoryAdapter(Context context, List<Story> stories) {
        super(context, 0, stories);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.story_list_item, parent, false);
        }

        Story currentStory = getItem(position);

        TextView storyCategoryView = (TextView) listItemView.findViewById(R.id.story_category);
        storyCategoryView.setText(currentStory.getCategory());

        TextView storyTitleView = (TextView) listItemView.findViewById(R.id.story_title);
        storyTitleView.setText(currentStory.getTitle());

        return listItemView;

    }

}
