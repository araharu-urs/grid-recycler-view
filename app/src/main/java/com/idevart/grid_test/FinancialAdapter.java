package com.idevart.grid_test;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.idevart.grid_test.model.FinancialItem;
import java.util.List;

public class FinancialAdapter extends RecyclerView.Adapter<FinancialAdapter.FinancialViewHolder> {

    public interface OnItemClickListener {
        void onItemClick(FinancialItem item);
    }

    private final List<FinancialItem> financialList;
    private final OnItemClickListener listener;

    public FinancialAdapter(List<FinancialItem> financialList, OnItemClickListener listener) {
        this.financialList = financialList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public FinancialViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_financial, parent, false);
        return new FinancialViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FinancialViewHolder holder, int position) {
        FinancialItem item = financialList.get(position);
        holder.title.setText(item.getTitle());
        holder.icon.setImageResource(
                holder.itemView.getContext().getResources()
                        .getIdentifier(item.getImage(), "mipmap", holder.itemView.getContext().getPackageName())
        );
        holder.itemView.setOnClickListener(v -> listener.onItemClick(item));
    }

    @Override
    public int getItemCount() {
        return financialList.size();
    }

    public static class FinancialViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        ImageView icon;

        public FinancialViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            icon = itemView.findViewById(R.id.imageView);
        }
    }
}
