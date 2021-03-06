// Generated by view binder compiler. Do not edit!
package com.example.listviewformyapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
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

public final class ProfessionsScreenBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final GridView gridView;

  @NonNull
  public final ImageView tavatar;

  @NonNull
  public final TextView tclaas;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView tname;

  private ProfessionsScreenBinding(@NonNull ConstraintLayout rootView, @NonNull GridView gridView,
      @NonNull ImageView tavatar, @NonNull TextView tclaas, @NonNull TextView textView,
      @NonNull TextView tname) {
    this.rootView = rootView;
    this.gridView = gridView;
    this.tavatar = tavatar;
    this.tclaas = tclaas;
    this.textView = textView;
    this.tname = tname;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ProfessionsScreenBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ProfessionsScreenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.professions_screen, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ProfessionsScreenBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.gridView;
      GridView gridView = ViewBindings.findChildViewById(rootView, id);
      if (gridView == null) {
        break missingId;
      }

      id = R.id.tavatar;
      ImageView tavatar = ViewBindings.findChildViewById(rootView, id);
      if (tavatar == null) {
        break missingId;
      }

      id = R.id.tclaas;
      TextView tclaas = ViewBindings.findChildViewById(rootView, id);
      if (tclaas == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.tname;
      TextView tname = ViewBindings.findChildViewById(rootView, id);
      if (tname == null) {
        break missingId;
      }

      return new ProfessionsScreenBinding((ConstraintLayout) rootView, gridView, tavatar, tclaas,
          textView, tname);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
