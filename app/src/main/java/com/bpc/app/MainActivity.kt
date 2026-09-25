package com.bpc.app

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val purple = Color.rgb(108, 77, 255)
    private val backgroundColor = Color.rgb(248, 247, 252)
    private val textColor = Color.rgb(23, 21, 31)
    private val secondaryText = Color.rgb(111, 107, 122)
    private val whiteColor = Color.WHITE

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        showWelcomeScreen()
    }

    private fun showWelcomeScreen() {

        val root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setBackgroundColor(backgroundColor)
            setPadding(40, 40, 40, 40)
        }

        val logo = TextView(this).apply {
            text = "BPC"
            textSize = 42f
            setTextColor(purple)
            typeface = Typeface.DEFAULT_BOLD
            gravity = Gravity.CENTER
        }

        val fullName = TextView(this).apply {
            text = "Business Purpose Contents"
            textSize = 16f
            setTextColor(textColor)
            gravity = Gravity.CENTER
        }

        val title = TextView(this).apply {
            text = "Create content\nthat sells."
            textSize = 32f
            setTextColor(textColor)
            typeface = Typeface.DEFAULT_BOLD
            gravity = Gravity.CENTER
            setPadding(0, 60, 0, 20)
        }

        val description = TextView(this).apply {
            text = "Create professional promotional content for your business with AI."
            textSize = 17f
            setTextColor(secondaryText)
            gravity = Gravity.CENTER
            setPadding(20, 0, 20, 40)
        }

        val getStarted = createButton(
            text = "Get Started",
            backgroundColor = purple,
            textColor = whiteColor
        )

        val login = createButton(
            text = "Log In",
            backgroundColor = whiteColor,
            textColor = purple
        )

        getStarted.setOnClickListener {
            showCreateAccountScreen()
        }

        login.setOnClickListener {
            showLoginScreen()
        }

        root.addView(
            logo,
            LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
        )

        root.addView(
            fullName,
            LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
        )

        root.addView(
            title,
            LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
        )

        root.addView(
            description,
            LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
        )

        root.addView(
            getStarted,
            LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                60
            ).apply {
                setMargins(20, 0, 20, 16)
            }
        )

        root.addView(
            login,
            LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                60
            ).apply {
                setMargins(20, 0, 20, 0)
            }
        )

        setContentView(root)
    }

    private fun showCreateAccountScreen() {
        showMessageScreen(
            "Create your BPC account",
            "Your account system is coming next."
        )
    }

    private fun showLoginScreen() {
        showMessageScreen(
            "Welcome back",
            "The BPC login system is coming next."
        )
    }

    private fun showMessageScreen(
        titleText: String,
        messageText: String
    ) {

        val root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setBackgroundColor(backgroundColor)
            setPadding(40, 40, 40, 40)
        }

        val title = TextView(this).apply {
            text = titleText
            textSize = 28f
            setTextColor(textColor)
            typeface = Typeface.DEFAULT_BOLD
            gravity = Gravity.CENTER
        }

        val message = TextView(this).apply {
            text = messageText
            textSize = 16f
            setTextColor(secondaryText)
            gravity = Gravity.CENTER
            setPadding(20, 20, 20, 40)
        }

        val back = createButton(
            text = "Back",
            backgroundColor = purple,
            textColor = whiteColor
        )

        back.setOnClickListener {
            showWelcomeScreen()
        }

        root.addView(
            title,
            LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
        )

        root.addView(
            message,
            LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
        )

        root.addView(
            back,
            LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                60
            ).apply {
                setMargins(20, 0, 20, 0)
            }
        )

        setContentView(root)
    }

    private fun createButton(
        text: String,
        backgroundColor: Int,
        textColor: Int
    ): TextView {

        return TextView(this).apply {
            this.text = text
            textSize = 16f
            setTextColor(textColor)
            setBackgroundColor(backgroundColor)
            gravity = Gravity.CENTER
            typeface = Typeface.DEFAULT_BOLD
            isClickable = true
            isFocusable = true
            setPadding(20, 0, 20, 0)
        }
    }
}
