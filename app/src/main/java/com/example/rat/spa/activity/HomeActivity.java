package com.example.rat.spa.activity;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.rat.spa.R;
import com.example.rat.spa.util.SharedPref;

public class HomeActivity extends AppCompatActivity {
  ConstraintLayout constraintLayout;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_home);
    constraintLayout = findViewById(R.id.home_layout);
    constraintLayout.setBackgroundResource(R.color.colorHome);
  }

  public void logOut(View view) {
    SharedPref.delete(this, "token");
    startActivity(new Intent(this, LoginActivity.class));
    finish();
  }

  public void toUserInfo(View view) {
    Intent intent = new Intent(getApplicationContext(), UserInfoActivity.class);
    startActivity(intent);
  }

  public void toStoreList(View view) {
    Intent intent = new Intent(getApplicationContext(), StoreListActivity.class);
    startActivity(intent);
  }

  public void toNotification(View view) {
    Toast.makeText(this, "This function isn't implemented yet...!", Toast.LENGTH_SHORT).show();
  }
}
