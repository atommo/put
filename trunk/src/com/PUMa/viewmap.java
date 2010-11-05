package com.PUMa;

import java.util.List;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapView;
import com.google.android.maps.Overlay;
import com.google.android.maps.OverlayItem;

public class viewmap extends MapActivity{
	public void onCreate(Bundle savedInstanceState)
	 {
	 super.onCreate(savedInstanceState);
	 setContentView(R.layout.main);

	 MapView mapView = (MapView) findViewById(R.id.viewmap);
	 mapView.setBuiltInZoomControls(true);

	 List<Overlay> mapOverlays = mapView.getOverlays();
	 Drawable drawable = this.getResources().getDrawable(R.drawable.icon);
	 HelloItemizedOverlay itemizedoverlay = new HelloItemizedOverlay(drawable,this);
	 GeoPoint point = new GeoPoint(30443769,-91158458);
	 OverlayItem overlayitem = new OverlayItem(point, "PUMa test USA", null);

	 GeoPoint point2 = new GeoPoint(17385812,78480667);
	 OverlayItem overlayitem2 = new OverlayItem(point2, "PUMa test Hyderabad :) :)", null);

	 itemizedoverlay.addOverlay(overlayitem);
	 itemizedoverlay.addOverlay(overlayitem2);

	 mapOverlays.add(itemizedoverlay);
	 }
	 @Override
	 protected boolean isRouteDisplayed()
	 {
	 return false;
	 }

}
