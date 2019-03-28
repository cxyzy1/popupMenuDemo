package com.cxyzy.popupmenudemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.PopupMenu
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener { onMenuClick(it) }
        custBtn.setOnClickListener {
            startActivity(Intent(this@MainActivity, CustMenuActivity::class.java))
        }
        xPopupBtn.setOnClickListener {
            startActivity(Intent(this@MainActivity, XPopupActivity::class.java))
        }
        basePopupBtn.setOnClickListener {
            startActivity(Intent(this@MainActivity, BasePopupActivity::class.java))
        }
    }

    private fun onMenuClick(view: View) {
        val popup = PopupMenu(this, view)
        popup.menuInflater.inflate(R.menu.main_menu, popup.menu)
        popup.setOnMenuItemClickListener { onMenuItemClick(it) }
        popup.show()
    }

    private fun onMenuItemClick(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu1 -> Toast.makeText(this, "menu1", Toast.LENGTH_SHORT).show()
            R.id.menu2 -> Toast.makeText(this, "menu2", Toast.LENGTH_SHORT).show()
            else -> {
            }
        }
        return false
    }
}
