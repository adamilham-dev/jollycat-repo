// Generated by view binder compiler. Do not edit!
package com.example.jollycat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.jollycat.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRegisterBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final MaterialButton btnRegister;

  @NonNull
  public final TextInputLayout edPasswordLayout;

  @NonNull
  public final TextInputLayout edPhoneLayout;

  @NonNull
  public final TextInputLayout edUsernameLayout;

  @NonNull
  public final TextInputEditText etRegisterName;

  @NonNull
  public final TextInputEditText etRegisterPassword;

  @NonNull
  public final TextInputEditText etRegisterPhoneNumber;

  @NonNull
  public final TextView tvLogInRedirect;

  @NonNull
  public final TextView tvLoginTitle;

  private ActivityRegisterBinding(@NonNull ScrollView rootView, @NonNull MaterialButton btnRegister,
      @NonNull TextInputLayout edPasswordLayout, @NonNull TextInputLayout edPhoneLayout,
      @NonNull TextInputLayout edUsernameLayout, @NonNull TextInputEditText etRegisterName,
      @NonNull TextInputEditText etRegisterPassword,
      @NonNull TextInputEditText etRegisterPhoneNumber, @NonNull TextView tvLogInRedirect,
      @NonNull TextView tvLoginTitle) {
    this.rootView = rootView;
    this.btnRegister = btnRegister;
    this.edPasswordLayout = edPasswordLayout;
    this.edPhoneLayout = edPhoneLayout;
    this.edUsernameLayout = edUsernameLayout;
    this.etRegisterName = etRegisterName;
    this.etRegisterPassword = etRegisterPassword;
    this.etRegisterPhoneNumber = etRegisterPhoneNumber;
    this.tvLogInRedirect = tvLogInRedirect;
    this.tvLoginTitle = tvLoginTitle;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_register, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegisterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_register;
      MaterialButton btnRegister = ViewBindings.findChildViewById(rootView, id);
      if (btnRegister == null) {
        break missingId;
      }

      id = R.id.ed_password_layout;
      TextInputLayout edPasswordLayout = ViewBindings.findChildViewById(rootView, id);
      if (edPasswordLayout == null) {
        break missingId;
      }

      id = R.id.ed_phone_layout;
      TextInputLayout edPhoneLayout = ViewBindings.findChildViewById(rootView, id);
      if (edPhoneLayout == null) {
        break missingId;
      }

      id = R.id.ed_username_layout;
      TextInputLayout edUsernameLayout = ViewBindings.findChildViewById(rootView, id);
      if (edUsernameLayout == null) {
        break missingId;
      }

      id = R.id.etRegisterName;
      TextInputEditText etRegisterName = ViewBindings.findChildViewById(rootView, id);
      if (etRegisterName == null) {
        break missingId;
      }

      id = R.id.etRegisterPassword;
      TextInputEditText etRegisterPassword = ViewBindings.findChildViewById(rootView, id);
      if (etRegisterPassword == null) {
        break missingId;
      }

      id = R.id.etRegisterPhoneNumber;
      TextInputEditText etRegisterPhoneNumber = ViewBindings.findChildViewById(rootView, id);
      if (etRegisterPhoneNumber == null) {
        break missingId;
      }

      id = R.id.tvLogInRedirect;
      TextView tvLogInRedirect = ViewBindings.findChildViewById(rootView, id);
      if (tvLogInRedirect == null) {
        break missingId;
      }

      id = R.id.tvLoginTitle;
      TextView tvLoginTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvLoginTitle == null) {
        break missingId;
      }

      return new ActivityRegisterBinding((ScrollView) rootView, btnRegister, edPasswordLayout,
          edPhoneLayout, edUsernameLayout, etRegisterName, etRegisterPassword,
          etRegisterPhoneNumber, tvLogInRedirect, tvLoginTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
