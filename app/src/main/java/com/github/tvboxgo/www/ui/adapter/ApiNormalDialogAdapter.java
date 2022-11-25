package com.github.tvboxgo.www.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.github.tvboxgo.www.R;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class ApiNormalDialogAdapter extends ListAdapter<String, ApiNormalDialogAdapter.SelectViewHolder> {

    class SelectViewHolder extends RecyclerView.ViewHolder {

        public SelectViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
        }
    }

    public interface SelectDialogInterface {
        void click(String value);
    }


    private ArrayList<String> data = new ArrayList<>();

    private String select = "";

    private SelectDialogInterface dialogInterface = null;

    public ApiNormalDialogAdapter(SelectDialogInterface dialogInterface) {
        super(new DiffUtil.ItemCallback<String>() {
            @Override
            public boolean areItemsTheSame(@NonNull @NotNull String oldItem, @NonNull @NotNull String newItem) {
                return oldItem.equals(newItem);
            }

            @Override
            public boolean areContentsTheSame(@NonNull @NotNull String oldItem, @NonNull @NotNull String newItem) {
                return oldItem.equals(newItem);
            }
        });
        this.dialogInterface = dialogInterface;
    }

    public void setData(List<String> newData, int defaultSelect) {
        data.clear();
        data.addAll(newData);
        if (defaultSelect > 0) {
            select = data.get(defaultSelect);
        }
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    @Override
    public ApiNormalDialogAdapter.SelectViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        return new ApiNormalDialogAdapter.SelectViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dialog_api_normal, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ApiNormalDialogAdapter.SelectViewHolder holder, int position) {
        String value = data.get(position);
        String name = value;
        if (select.equals(value))
            name = "√ " + name;
        ((TextView) holder.itemView.findViewById(R.id.tvName)).setText(name);
        holder.itemView.findViewById(R.id.tvName).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (select.equals(value))
                    return;
                notifyItemChanged(data.indexOf(select));
                select = value;
                notifyItemChanged(data.indexOf(value));
                dialogInterface.click(value);
            }
        });
    }
}
