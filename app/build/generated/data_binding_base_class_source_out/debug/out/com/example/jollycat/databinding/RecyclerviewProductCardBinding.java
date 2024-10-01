// Generated by view binder compiler. Do not edit!
package com.example.jollycat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.jollycat.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RecyclerviewProductCardBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView desc;

  @NonNull
  public final ImageView idIVCatImage;

  @NonNull
  public final TextView idTVCatName;

  @NonNull
  public final TextView idTVPrice;

  private RecyclerviewProductCardBinding(@NonNull CardView rootView, @NonNull TextView desc,
      @NonNull ImageView idIVCatImage, @NonNull TextView idTVCatName, @NonNull TextView idTVPrice) {
    this.rootView = rootView;
    this.desc = desc;
    this.idIVCatImage = idIVCatImage;
    this.idTVCatName = idTVCatName;
    this.idTVPrice = idTVPrice;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static RecyclerviewProductCardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RecyclerviewProductCardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.recyclerview_product_card, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RecyclerviewProductCardBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.desc;
      TextView desc = ViewBindings.findChildViewById(rootView, id);
      if (desc == null) {
        break missingId;
      }

      id = R.id.idIVCatImage;
      ImageView idIVCatImage = ViewBindings.findChildViewById(rootView, id);
      if (idIVCatImage == null) {
        break missingId;
      }

      id = R.id.idTVCatName;
      TextView idTVCatName = ViewBindings.findChildViewById(rootView, id);
      if (idTVCatName == null) {
        break missingId;
      }

      id = R.id.idTVPrice;
      TextView idTVPrice = ViewBindings.findChildViewById(rootView, id);
      if (idTVPrice == null) {
        break missingId;
      }

      return new RecyclerviewProductCardBinding((CardView) rootView, desc, idIVCatImage,
          idTVCatName, idTVPrice);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
