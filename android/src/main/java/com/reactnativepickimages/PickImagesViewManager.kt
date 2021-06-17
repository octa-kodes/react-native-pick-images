package com.reactnativepickimages

import android.graphics.Color
import android.support.constraint.ConstraintLayout
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.camera.view.PreviewView
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp

class PickImagesViewManager : SimpleViewManager<ConstraintLayout>() {
  override fun getName() = "PickImagesView"

  override fun createViewInstance(reactContext: ThemedReactContext): ConstraintLayout {
    val view = ConstraintLayout(reactContext)
    view.layoutParams.width = ConstraintLayout.LayoutParams.MATCH_PARENT
    view.layoutParams.height = ConstraintLayout.LayoutParams.MATCH_PARENT

    val captureButton = Button(reactContext)
    captureButton.layoutParams.width = 100
    captureButton.layoutParams.height = 100

    val params = captureButton.layoutParams as ConstraintLayout.LayoutParams
    params.bottomMargin = 50

    captureButton.text = "Capture"

    params.leftToLeft = view.id
    params.rightToRight = view.id
    params.bottomToBottom = view.id

    captureButton.elevation = 2F

    view.addView(captureButton)
    return view
  }

  @ReactProp(name = "color")
  fun setColor(view: ConstraintLayout, color: String) {
    view.setBackgroundColor(Color.parseColor(color))
  }
}
