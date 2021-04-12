package com.ltts.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import net.objecthunter.exp4j.Expression
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        /*Number Buttons*/

        One.setOnClickListener {
            evaluate("1", false)
        }

        Two.setOnClickListener {
            evaluate("2", false)
        }

        Three.setOnClickListener {
            evaluate("3", false)
        }

        Four.setOnClickListener {
            evaluate("4", false)
        }

        Five.setOnClickListener {
            evaluate("5", false)
        }

        Six.setOnClickListener {
            evaluate("6", false)
        }

        Seven.setOnClickListener {
            evaluate("7", false)
        }

        Eight.setOnClickListener {
            evaluate("8", false)
        }

        Nine.setOnClickListener {
            evaluate("9", false)
        }

        Zero.setOnClickListener {
            evaluate("0", false)
        }

        /*Operators*/

        Plus.setOnClickListener {
            evaluate("+", false)
        }

        Minus.setOnClickListener {
            evaluate("-", false)
        }

        Mul.setOnClickListener {
            evaluate("*", false)
        }

        Divide.setOnClickListener {
            evaluate("/", false)
        }

        Dot.setOnClickListener {
            evaluate(".", false)
        }

        Clear.setOnClickListener {
            Expression.text = ""
            Result.text = ""
        }

        Equals.setOnClickListener {
            try {
                val expression = ExpressionBuilder(Expression.text.toString()).build()
                val result = expression.evaluate()
                val longResult = result.toLong()
                if (result == longResult.toDouble()) {
                    Toast.makeText(this, "Result", Toast.LENGTH_SHORT).show()
                    Result.text = longResult.toString()
                } else
                    Result.text = result.toString()

            } catch (e: Exception) {
                Toast.makeText(this, e.message, Toast.LENGTH_SHORT).show();

                Log.d("EXCEPTION", "Message: ${e.message}")
            }

        }

        Back.setOnClickListener {
            val expression = Expression.text.toString()
            if (expression.isNotEmpty()) {
                Expression.text = expression.substring(0, expression.length - 1)
            }
        }

    fun evaluate(s: String, clear: Boolean) {
        if(clear) {
            Result.text = ""
            Expression.append(s)
        } else {
            Expression.append(Result.text)
            Expression.append(s)
            Result.text = ""
        }
    }
    }

}
