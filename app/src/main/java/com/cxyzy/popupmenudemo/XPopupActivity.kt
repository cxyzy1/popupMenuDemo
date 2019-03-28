package com.cxyzy.popupmenudemo

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.PopupMenu
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.lxj.xpopup.XPopup
import kotlinx.android.synthetic.main.activity_main.*

/**
 * 使用第三方开源组件：https://github.com/li-xiaojun/XPopup
 */
class XPopupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cust)
        button.setOnClickListener {
            XPopup.Builder(this)
                    .atView(it)  // 依附于所点击的View，内部会自动判断在上方或者下方显示
                    .asAttachList(arrayOf("分享", "编辑", "不带icon"),
                            null
                    ) { position, text -> Toast.makeText(this, "clicked pos:$position", Toast.LENGTH_SHORT).show() }
                    .show()
        }

    }

}
