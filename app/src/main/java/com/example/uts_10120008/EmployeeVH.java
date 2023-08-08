package com.example.uts_10120008;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;




// NIM : 10120008
// NAMA : WILLIAM MARCELLINO PUTRA PARTO LEKSONO
// KELAS : IF 1
public class EmployeeVH extends RecyclerView.ViewHolder
{
    public TextView tv_title,tv_note, tv_category,tv_date, tv_option;
    public EmployeeVH(@NonNull View itemView)
    {
        super(itemView);
        tv_title = itemView.findViewById(R.id.tv_title);
        tv_note = itemView.findViewById(R.id.tv_note);
        tv_category = itemView.findViewById(R.id.tv_category);
        tv_date = itemView.findViewById(R.id.tv_date);
        tv_option = itemView.findViewById(R.id.tv_option);
    }
}
