package com.example.sutdentapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

public class Adapter extends BaseQuickAdapter<Student, BaseViewHolder> {
    public Adapter(@Nullable List<Student>data){super(R.layout.activity_main,data);

    }

    @Override
    protected void convert(@NonNull BaseViewHolder helper, Student activity) {
        helper.setText(R.id.im_name,activity.getName());
    }
}
