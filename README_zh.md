# NumberCodeView
一个类似微信支付和支付宝支付的时候输入密码面板的控件。

# 使用方式

### 普通样式

正常情况下，你可以把控件的声明写到你的 '.xml' 文件里面。

```
<com.lkp.numbercodeview.normal.NumberCodeView
        android:id="@+id/numberCodeView"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_alignParentBottom="true"
        numbercodeview:isPassword="true"/>
```

可以使用 `numbercodeview:isPassword` 这个属性去控制是否是密码，密码的话会用黑点替代数字。

### 底部面板样式

使用底部样式，那么久可以从界面的底部弹出来。

可以通过以下代码进行调用:

```
BottomSheetNumberCodeViewActivity.show(this, mIsPassword);
```

### `isPassword` 属性

如果是密码，那么输入框里面的数字将会用 ● 取代。


# 截屏

![](https://github.com/linkaipeng/NumberCodeView/raw/master/screenshots/screenshot01.png)
![](https://github.com/linkaipeng/NumberCodeView/raw/master/screenshots/screenshot02.png)
![](https://github.com/linkaipeng/NumberCodeView/raw/master/screenshots/screenshot03.png)
![](https://github.com/linkaipeng/NumberCodeView/raw/master/screenshots/screenshot04.png)
![](https://github.com/linkaipeng/NumberCodeView/raw/master/screenshots/screenshot05.png)

## LICENSE

```
Copyright 2015 linkaipeng

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

<http://www.apache.org/licenses/LICENSE-2.0>

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

```
