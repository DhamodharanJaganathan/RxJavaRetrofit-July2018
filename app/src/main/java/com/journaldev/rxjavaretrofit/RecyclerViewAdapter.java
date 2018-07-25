package com.journaldev.rxjavaretrofit;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.journaldev.rxjavaretrofit.pojo.Item;
import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

  private List<Item> marketList;


  public RecyclerViewAdapter() {
    marketList = new ArrayList<>();
  }

  @Override
  public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
      int viewType) {

    View view = LayoutInflater.from(parent.getContext())
        .inflate(R.layout.recyclerview_item_layout, parent, false);

    RecyclerViewAdapter.ViewHolder viewHolder = new RecyclerViewAdapter.ViewHolder(view);
    return viewHolder;
  }

  @Override
  public void onBindViewHolder(RecyclerViewAdapter.ViewHolder holder, int position) {
    Item market = marketList.get(position);
    holder.txtCoin.setText(market.getVariations().getPreviewSmall().getUrl());
    holder.txtMarket.setText(market.getAuthor());
    holder.txtPrice.setText(market.getUploadedAt());


  }

  @Override
  public int getItemCount() {
    return marketList.size();
  }

  public void setData(List<Item> data) {
    this.marketList.addAll(data);
    notifyDataSetChanged();
  }

  public class ViewHolder extends RecyclerView.ViewHolder {

    public TextView txtCoin;
    public TextView txtMarket;
    public TextView txtPrice;
    public CardView cardView;

    public ViewHolder(View view) {
      super(view);

      txtCoin = view.findViewById(R.id.txtCoin);
      txtMarket = view.findViewById(R.id.txtMarket);
      txtPrice = view.findViewById(R.id.txtPrice);
      cardView = view.findViewById(R.id.cardView);
    }
  }
}
