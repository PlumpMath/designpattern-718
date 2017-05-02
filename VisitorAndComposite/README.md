getFullPath
===

仕様
---
```java
public String getFullPath(){
  StringBuffer stb = new StringBuffer();
  Entry entry = this;
  do{
    stb.insert(0, "/"+entry.getName());
    entry = entry.parent;
  }while(entry!=null);
  return stb.toString();
}
```
1. stb.insertで頭にインスタンスのnameを挿入
2. entryにインスタンスの親に入れ替える
3. entry.parentがnullなのは一番親のDirectoryを意味するので、breakする。

``` java
e.g.

rootdir.add(usrdir);
System.out.println(usrdir);
```

```
rootdir/usrdir
```
