package com.wittayapun.june.test2.item;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.ByteArrayOutputStream;

// ยังไม่ได้ใช้
public class Utility {
    // convert from bitmap to byte array
    public static byte[] Icon(Bitmap bitmap) {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, stream);
        return stream.toByteArray();
    }

    // convert from byte array to bitmap
    public static Bitmap getIcon(byte[] image) {
        return BitmapFactory.decodeByteArray(image, 0, image.length);
    }
}

