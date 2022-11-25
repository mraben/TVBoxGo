package com.github.tvboxgo.www.ui.dialog;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.github.tvboxgo.www.R;
import com.github.tvboxgo.www.ui.adapter.ApiNormalDialogAdapter;
import com.owen.tvrecyclerview.widget.TvRecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ApiNormalDialog extends BaseDialog {
    public ApiNormalDialog(@NonNull @NotNull Context context) {
        super(context, R.style.CustomDialogStyleDim);
        setContentView(R.layout.dialog_api_normal);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public void setTip(String tip) {
        ((TextView) findViewById(R.id.title)).setText(tip);
    }

    public void setAdapter(ApiNormalDialogAdapter.SelectDialogInterface sourceBeanSelectDialogInterface, List<String> data, int select) {
        ApiNormalDialogAdapter adapter = new ApiNormalDialogAdapter(sourceBeanSelectDialogInterface);
        adapter.setData(data, select);
        TvRecyclerView tvRecyclerView = ((TvRecyclerView) findViewById(R.id.list));
        tvRecyclerView.setAdapter(adapter);
        tvRecyclerView.setSelectedPosition(select);
        tvRecyclerView.post(new Runnable() {
            @Override
            public void run() {
                tvRecyclerView.scrollToPosition(Math.max(select, 0));
            }
        });
    }
}
