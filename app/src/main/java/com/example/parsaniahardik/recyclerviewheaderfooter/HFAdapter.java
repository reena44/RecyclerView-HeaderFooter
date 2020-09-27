package com.example.parsaniahardik.recyclerviewheaderfooter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class HFAdapter extends RecyclerView.Adapter<HFAdapter.MyViewHolder> {

    public static final int Header = 1;
    public static final int Normal = 2;
    public static final int Footer = 3;

    private LayoutInflater inflater;
    private ArrayList<HeaderModel> headerModelArrayList;;

    public HFAdapter(Context ctx,  ArrayList<HeaderModel> headerModelArrayList){

        inflater = LayoutInflater.from(ctx);
        this.headerModelArrayList = headerModelArrayList;
    }

    @Override
    public int getItemViewType(int position) {

        if(headerModelArrayList.get(position).getViewType().equals("header")){
            return Header;
        }
        else if(headerModelArrayList.get(position).getViewType().equals("footer")){
            return Footer;
        }
        else {
            return Normal;
        }

    }

    @Override
    public HFAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view ;
        MyViewHolder holder;

        switch (viewType)
        {
            case Normal:
                view = inflater.inflate(R.layout.single_item, parent, false);
                holder = new MyViewHolder(view , Normal);
                break;

            case Header:
                view = inflater.inflate(R.layout.rv_header, parent, false);
                holder = new MyViewHolder(view , Header);
                break;
            case Footer:

                view = inflater.inflate(R.layout.rv_footer, parent, false);
                holder = new MyViewHolder(view , Footer);
                break;

            default:

                view = inflater.inflate(R.layout.single_item, parent, false);
                holder = new MyViewHolder(view , Normal);
                break;
        }




        return holder;
    }

    @Override
    public void onBindViewHolder(HFAdapter.MyViewHolder holder, int position) {

        if(headerModelArrayList.get(position).getViewType().equals("header")){
            //holder.tvProduct.setText(" Item No : " + headerModelArrayList.get(position).getText());
        }
        else if(headerModelArrayList.get(position).getViewType().equals("footer")){
           // holder.tvProduct.setText(" Item No : " + headerModelArrayList.get(position).getText());
        }
        else {
            holder.tvProduct.setText(" Item No : " + headerModelArrayList.get(position).getText());
        }


    }

    @Override
    public int getItemCount() {
        return headerModelArrayList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView tvProduct;

        public MyViewHolder(View itemView, int viewType) {
            super(itemView);

            if(viewType == Normal){
                tvProduct = (TextView) itemView.findViewById(R.id.tv);
            }
       }

    }
}
