package com.example.lab041;

// MonHocAdapter.java
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class MonHocAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater inflater;
    private List<MonHoc> monHocList;

    public MonHocAdapter(Context context, List<MonHoc> monHocList) {
        this.context = context;
        this.monHocList = monHocList;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return monHocList.size();
    }

    @Override
    public Object getItem(int position) {
        return monHocList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.list_item_monhoc, null);
            viewHolder = new ViewHolder();

            viewHolder.imgHinhMonHoc = convertView.findViewById(R.id.imgHinhMonHoc);
            viewHolder.tvMaHP = convertView.findViewById(R.id.tvMaHP);
            viewHolder.tvTenHP = convertView.findViewById(R.id.tvTenHP);
            viewHolder.tvTenGV = convertView.findViewById(R.id.tvTenGV);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        MonHoc monHoc = monHocList.get(position);

        viewHolder.imgHinhMonHoc.setImageResource(monHoc.getTenHinh());
        viewHolder.tvMaHP.setText("Mã HP: " + monHoc.getMaHP());
        viewHolder.tvTenHP.setText("Tên HP: " + monHoc.getTenHP());
        viewHolder.tvTenGV.setText("Tên GV: " + monHoc.getTenGV());

        return convertView;
    }

    static class ViewHolder {
        ImageView imgHinhMonHoc;
        TextView tvMaHP;
        TextView tvTenHP;
        TextView tvTenGV;
    }
}
