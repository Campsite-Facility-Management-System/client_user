package com.example.client_user

import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.android.SplashScreen

class MainActivity: FlutterActivity() {
       override fun provideSplashScreen(): SplashScreen? = SplashView()
}
