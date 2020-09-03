package jp.wings.nikkeibp.omikuji

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.RotateAnimation
import android.view.animation.TranslateAnimation
import android.widget.ImageView

class OmikujiActivity : AppCompatActivity() {
    //おみくじ棚の配列
    val omikujiShelf = Array<omikujiParts>(20)
    {OmikujiPatrts(R.drawable.result2,R.string.contents1)}
    //おみくじ番号保管用
    var omikujiNumber = -1
    val omikujiBox = OmikujiBox()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.omikuji)
        omikujiBox.omikujiView = imageView
        ImageView.setImageResource(R.drawable.result1)
        /*
    //文字を表示
        val str = "大吉"
        hello_view.text = str
        val rnd = Ranom()
        val number = rnd.nextInt(20)
        hello_view.text = "$str 乱数 ${number + 1}"
        if( number == 0) {
            str = "吉"
        } else if (number == 1){
            str = "凶"}
        //おみくじ「棚の準備
        val omikujiShelf = Array<String>(20,{"吉"})
        omikujiShelf[0] = "大吉"
        omikujiShelf[19] = "凶"
        //おみくじ棚から取得
        val str = omikujiShelf[number]
        hello_view.text = str
        */

    }
    fun onButtonClick(v:View){
        omikujiBox.Shake()
        /*
        val translate = TranslateAnimation(0f,0f,0f,-200f)
        translate.repeatMode = Animation.REVERSE
        translate.repeatCount = 5
        translate.duration = 100
        val rotate = RotateAnimation(0f,-36f,imageView.width/2f,imageView.height/2f)
        rotate.duration = 200
        val set = AnimationSet(true)
        set.addAnimation(rotate)
        set.addAnimation(translate)
        imageView.starAnimation(set)
         */
        //  imageView.setImageResorce(R.drawable.result1)
    }
    }