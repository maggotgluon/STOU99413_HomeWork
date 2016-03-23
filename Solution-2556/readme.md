#ชุดวิชา การโปรแกรมคอมพิวเตอร์ขั้นสูง (99413)
##ปีะจำปีการศึกษา 2556
###แนวทางการแก้ไขโจย์

ผลลัพธ์ที่ใช้ตั้งต้น

![Image of starter](https://maggotgluon.github.com/STOU99413_HomeWork/StarterCode/99413Home-starter.png)

ผลลัพธ์ที่โจย์ต้องการ
![Image of solution](https://maggotgluon.github.com/STOU99413_HomeWork/StarterCode/99413Home-solution.png)

จุดที่แตกต่าง
![Image of differance](https://maggotgluon.github.com/STOU99413_HomeWork/StarterCode/99413Home-differance.png)

*จุดที่ 1
เปลี่ยน Title bar จาก "STOU Calculator" เป็น "STOUhome Calculator"
>Code บรรทัดที่ 158
code เดิม
```java
		calci.setTitle("STOU Calculator");
```
code ใหม่
```java
		calci.setTitle("STOUhome Calculator");
```

*จุดที่ 2
ตัวเลขแถวที่ 1 จากเดิม 7 8 9 เป็น 1 2 3
>Code บรรทัดที่ 158
code เดิม
```java
		for(int i=7; i<=9; i++) {
```
code ใหม่
```java
		for(int i=1; i<=3; i++) {
```

*จุดที่ 3
ตัวเลขแถวที่ 1 จากเดิม 1 2 3 เป็น 7 8 9
>Code บรรทัดที่ 158
code เดิม
```java
		for( int i=1; i<=3; i++) {
```
code ใหม่
```java
		for( int i=7; i<=9; i++) {
```

*จุดที่ 4
เปลี่ยนจาก sqrt เป็น %
>Code บรรทัดที่ 156
code เดิม
```java
		jplButtons.add(jbnButtons[17]);
```
code ใหม่
```java
		jplButtons.add(jbnButtons[19]);
```

*จุดที่ 5
เปลี่ยนจาก % เป็น sqrt
>Code บรรทัดที่ 174
code เดิม
```java
		jplButtons.add(jbnButtons[19]);
```
code ใหม่
```java
		jplButtons.add(jbnButtons[17]);
```
