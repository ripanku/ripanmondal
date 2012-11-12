package me.rajib.android;



import android.app.Activity;

import android.os.Bundle;
import android.content.Context;
import android.content.res.TypedArray;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.Toast;

public class practise3 extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.b);
	    Gallery g = (Gallery) findViewById(R.id.gallery);
        g.setAdapter(new ImageAdapter(this));
        g.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(@SuppressWarnings("rawtypes") AdapterView parent, View v, int position, long id) {
                Toast.makeText(practise3.this, "" + position, Toast.LENGTH_SHORT).show();
            }
        });
    }
public class ImageAdapter extends BaseAdapter {
    int mGalleryItemBackground;
    private Context mContext;
    private Integer[] mImageIds = {
            R.drawable.albatross,
            R.drawable.bulbul,
            R.drawable.cockatoo,
            R.drawable.dove,
            R.drawable.eagle,
            R.drawable.falcons,
            R.drawable.gull,
            R.drawable.hummingbird,
            R.drawable.ibis,
            R.drawable.jackdaw,
            R.drawable.kingfisher,
            R.drawable.limpkin,
            R.drawable.magpie,
            R.drawable.owl,
            R.drawable.parrot,
            R.drawable.quetzal,
            R.drawable.robin,
            R.drawable.swan,
            R.drawable.trembler,
            R.drawable.umbrell,
            R.drawable.vulture,
            R.drawable.wren,
            R.drawable.xenops,
            R.drawable.yago,
            R.drawable.zigzagheron,
    };
    public ImageAdapter(Context c) {
        mContext = c;
        TypedArray a = obtainStyledAttributes(R.styleable.HelloGallery);
        mGalleryItemBackground = a.getResourceId(
                R.styleable.HelloGallery_android_galleryItemBackground, 0);
        a.recycle();
    }
    public int getCount() {
        return mImageIds.length;
    }
    public Object getItem(int position) {
        return position;
    }
    public long getItemId(int position) {
        return position;
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView i = new ImageView(mContext);
        i.setImageResource(mImageIds[position]);
        i.setLayoutParams(new Gallery.LayoutParams(150, 100));
        i.setScaleType(ImageView.ScaleType.FIT_XY);
        i.setBackgroundResource(mGalleryItemBackground);
        return i;
    }
}

	

}
