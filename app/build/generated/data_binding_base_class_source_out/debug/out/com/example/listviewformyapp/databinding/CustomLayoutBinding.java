// Generated by view binder compiler. Do not edit!
package com.example.listviewformyapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.listviewformyapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CustomLayoutBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView Tavatar;

  @NonNull
  public final TextView Tclaas;

  @NonNull
  public final TextView Tname;

  private CustomLayoutBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView Tavatar,
      @NonNull TextView Tclaas, @NonNull TextView Tname) {
    this.rootView = rootView;
    this.Tavatar = Tavatar;
    this.Tclaas = Tclaas;
    this.Tname = Tname;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CustomLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CustomLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.custom_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CustomLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Tavatar;
      ImageView Tavatar = ViewBindings.findChildViewById(rootView, id);
      if (Tavatar == null) {
        break missingId;
      }

      id = R.id.Tclaas;
      TextView Tclaas = ViewBindings.findChildViewById(rootView, id);
      if (Tclaas == null) {
        break missingId;
      }

      id = R.id.Tname;
      TextView Tname = ViewBindings.findChildViewById(rootView, id);
      if (Tname == null) {
        break missingId;
      }

      return new CustomLayoutBinding((ConstraintLayout) rootView, Tavatar, Tclaas, Tname);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}