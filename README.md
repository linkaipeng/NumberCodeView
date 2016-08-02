# NumberCodeView
A number input view which like input password in alipay or wechat pay.

# Usage

### Normal Style

Normal, start to an activity which include the NumberCodeView.

Add to your '.xml' file.

```
<com.lkp.numbercodeview.normal.NumberCodeView
        android:id="@+id/numberCodeView"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_alignParentBottom="true"
        numbercodeview:isPassword="true"/>
```

Use the `numbercodeview:isPassword` attribute.

### BottomSheet Style

Bottom sheet style, an activity with dialog style. Popup from bottom of screen.

Call Bottom sheet style NumberCodeView with a single line code. Like this:

```
BottomSheetNumberCodeViewActivity.show(this, mIsPassword);
```

### `isPassword` Attribute

If it is password, the number will be replaced with symbol ●


# Screenshots

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