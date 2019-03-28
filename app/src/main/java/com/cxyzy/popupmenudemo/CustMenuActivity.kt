package com.cxyzy.popupmenudemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.PopupMenu
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Toast

/**
 * 能定制背景色、字体大小、颜色、分割线，通过在manifest文件声明Activity时指定style实现。
 * 但是不能调整宽度。
 */
class CustMenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cust)
        button.setOnClickListener { onMenuClick(it) }
    }

    private fun onMenuClick(view: View) {
        val popup = PopupMenu(this, view)
        popup.menuInflater.inflate(R.menu.main_menu, popup.menu)
        popup.setOnMenuItemClickListener { onMenuItemClick(it) }
        popup.show()
    }

    private fun onMenuItemClick(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu1 -> Toast.makeText(this, "菜单1", Toast.LENGTH_SHORT).show()
            R.id.menu2 -> Toast.makeText(this, "菜单2", Toast.LENGTH_SHORT).show()
            else -> {
            }
        }
        return false
    }
}
