package com.cxyzy.popupmenudemo

import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import razerdp.basepopup.QuickPopupBuilder
import razerdp.basepopup.QuickPopupConfig


/**
 * 使用第三方开源组件：https://github.com/razerdp/BasePopup
 */
class BasePopupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cust)
        button.setOnClickListener {
        QuickPopupBuilder.with(this)
                .contentView(R.layout.popup_menu_small)
                .config(QuickPopupConfig()
                        .clipChildren(true)
                        .backgroundColor(Color.parseColor("#8C617D8A"))
                        .withClick(R.id.tx_1, { Toast.makeText(this, "tx1", Toast.LENGTH_SHORT).show() }, true)
                        .withClick(R.id.tx_2, { Toast.makeText(this, "tx2", Toast.LENGTH_SHORT).show() }, true)
                        .withClick(R.id.tx_3, { Toast.makeText(this, "tx3", Toast.LENGTH_SHORT).show() }, true)
                )
                .show(button)

        }

    }

}
