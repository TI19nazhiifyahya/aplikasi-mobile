// Generated by view binder compiler. Do not edit!
package com.nazhiif.fima.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.nazhiif.fima.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentLoginPageBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button buttonDaftar;

  @NonNull
  public final Button buttonMasuk;

  @NonNull
  public final EditText editTextPasswordLogin;

  @NonNull
  public final EditText editTextUsernameLogin;

  @NonNull
  public final ImageView imageViewLogin;

  @NonNull
  public final TextView textViewBelumPunyaAkun;

  @NonNull
  public final TextView textViewLogin;

  private FragmentLoginPageBinding(@NonNull ConstraintLayout rootView, @NonNull Button buttonDaftar,
      @NonNull Button buttonMasuk, @NonNull EditText editTextPasswordLogin,
      @NonNull EditText editTextUsernameLogin, @NonNull ImageView imageViewLogin,
      @NonNull TextView textViewBelumPunyaAkun, @NonNull TextView textViewLogin) {
    this.rootView = rootView;
    this.buttonDaftar = buttonDaftar;
    this.buttonMasuk = buttonMasuk;
    this.editTextPasswordLogin = editTextPasswordLogin;
    this.editTextUsernameLogin = editTextUsernameLogin;
    this.imageViewLogin = imageViewLogin;
    this.textViewBelumPunyaAkun = textViewBelumPunyaAkun;
    this.textViewLogin = textViewLogin;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentLoginPageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentLoginPageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_login_page, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentLoginPageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonDaftar;
      Button buttonDaftar = ViewBindings.findChildViewById(rootView, id);
      if (buttonDaftar == null) {
        break missingId;
      }

      id = R.id.buttonMasuk;
      Button buttonMasuk = ViewBindings.findChildViewById(rootView, id);
      if (buttonMasuk == null) {
        break missingId;
      }

      id = R.id.editTextPasswordLogin;
      EditText editTextPasswordLogin = ViewBindings.findChildViewById(rootView, id);
      if (editTextPasswordLogin == null) {
        break missingId;
      }

      id = R.id.editTextUsernameLogin;
      EditText editTextUsernameLogin = ViewBindings.findChildViewById(rootView, id);
      if (editTextUsernameLogin == null) {
        break missingId;
      }

      id = R.id.imageViewLogin;
      ImageView imageViewLogin = ViewBindings.findChildViewById(rootView, id);
      if (imageViewLogin == null) {
        break missingId;
      }

      id = R.id.textViewBelumPunyaAkun;
      TextView textViewBelumPunyaAkun = ViewBindings.findChildViewById(rootView, id);
      if (textViewBelumPunyaAkun == null) {
        break missingId;
      }

      id = R.id.textViewLogin;
      TextView textViewLogin = ViewBindings.findChildViewById(rootView, id);
      if (textViewLogin == null) {
        break missingId;
      }

      return new FragmentLoginPageBinding((ConstraintLayout) rootView, buttonDaftar, buttonMasuk,
          editTextPasswordLogin, editTextUsernameLogin, imageViewLogin, textViewBelumPunyaAkun,
          textViewLogin);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}