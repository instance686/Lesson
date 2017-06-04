package com.example.android.learnactview;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ayush on 3/6/17.
 */

public class ContentAdapter extends RecyclerView.Adapter {
    private List<Row> rows;
    int[] layout;
    Context c;
    View v;


    public ContentAdapter(List<Row> rows, Context c, RecyclerView recyclerView) {
        this.rows = rows;
        this.c = c;
        if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {

            final LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView
                    .getLayoutManager();
        }
    }


    public void delete(int position) {
        rows.remove(position);
        notifyItemRemoved(position);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        v = LayoutInflater.from(viewGroup.getContext()).inflate(
                R.layout.card_contents, viewGroup, false);
        return new RowHolder(v,c);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        MyViewPagerAdapter myViewPagerAdapter;
        int[] layout=new int[]{R.layout.program_view, R.layout.program_view};

        if(viewHolder instanceof RowHolder){
            Row row=(Row)rows.get(i);
            String code=rows.get(i).getContents().get(0).getPoints().get(0).getJavaCode().toString();
            Log.d("code",code);
           // ((RowHolder)viewHolder).subHeadDesc.setText(row.getContents().get(0).getSubHeadDescription());
            myViewPagerAdapter=new MyViewPagerAdapter(c,code,new int[]{R.layout.program_view, R.layout.program_view});
            ((RowHolder)viewHolder).viewPager.setAdapter(myViewPagerAdapter);

        }

    }

    @Override
    public int getItemCount() {
        return rows.size();
    }

    private class RowHolder extends RecyclerView.ViewHolder{
        TextView subHeading,subHeadDesc,pointNum,pointHead,pointHDesc;
        Button b2,b3;
        Context ctx;
        private ViewPager viewPager;


        public RowHolder(View v,Context c) {
            super(v);
            this.ctx=c;
            subHeading= (TextView) v.findViewById(R.id.subheading);
            subHeadDesc= (TextView) v.findViewById(R.id.subDesc);
            pointNum= (TextView) v.findViewById(R.id.pointNum);
            pointHead= (TextView) v.findViewById(R.id.pointHead);
            pointHDesc= (TextView) v.findViewById(R.id.pointDesc);
            layout=new int[]
                    {R.layout.program_view, R.layout.program_view};
            viewPager= (ViewPager) v.findViewById(R.id.view_pager);
            b2= (Button) v.findViewById(R.id.button2);
            b3=(Button)v.findViewById(R.id.button3);


        }

    }
    public class MyViewPagerAdapter extends PagerAdapter {
        private LayoutInflater layoutInflater;
        Context c;
        String code;
        int[] layout;
        TextView tv;

        public MyViewPagerAdapter(Context c,String code,int[] layout) {
            this.c=c;
            this.code=code;
            this.layout=layout;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            layoutInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View view = layoutInflater.inflate(layout[position], container, false);
               tv = (TextView) view.findViewById(R.id.java_code);
               if(position==0)
               tv.setText(Html.fromHtml(code));
               else
               tv.setText("hi");

            container.addView(view);

            return view;
        }

        @Override
        public int getCount() {
            return layout.length;
        }

        @Override
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }


        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            View view = (View) object;
            container.removeView(view);
        }
    }


}
