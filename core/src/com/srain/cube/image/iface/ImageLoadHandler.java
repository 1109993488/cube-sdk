package com.srain.cube.image.iface;

import android.graphics.drawable.BitmapDrawable;

import com.srain.cube.image.CubeImageView;
import com.srain.cube.image.ImageTask;

/**
 * A handler that used in loading a image.
 * 
 * <p>
 * {@link ImageLoadHandler#onLoading(ImageTask)} will be called when begin to load the image.
 * </p>
 * 
 * <p>
 * {@link ImageLoadHandler#onLoadFinish(ImageTask, BitmapDrawable)} will be called after the image is loaded.
 * </p>
 */
public interface ImageLoadHandler {

	/**
	 * When begin to load the image from disk or network.
	 */
	public void onLoading(ImageTask imageTask, CubeImageView cubeImageView);

	/**
	 * After image is loaded.
	 */
	public void onLoadFinish(ImageTask imageTask, CubeImageView cubeImageView, BitmapDrawable drawable);
}