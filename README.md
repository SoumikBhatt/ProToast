# ProToast
![API](https://img.shields.io/badge/API-16%2B-brightgreen.svg?style=flat)

Toast Like a Pro

## Prerequisites

Add this in your project level `build.gradle` file :

```gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

## Dependency

Add this to your module's `build.gradle` file :

```gradle
dependencies {
	...
	implementation 'com.github.SoumikBhatt:ProToast:1.0.1'
}
```

## Usage

After adding the dependency, you can start using `ProToast` straight way.

**Use `1` for Long duration Toast and `0` for Short duration Toast**

Display a **Success** Toast :

```kotlin
ProToast.success(yourContext,"This is a success Toast",0)
``` 

Display an **Error** Toast :

```kotlin
ProToast.error(yourContext,"This is an error Toast",0)
``` 

Display a **Warning** Toast :

```kotlin
ProToast.warning(yourContext,"This is a warning Toast",0)
``` 

Display an **Info** Toast :

```kotlin
ProToast.info(yourContext,"This is an info Toast",0)
``` 

You can also create your own **Custom** toast like this: 

```Kotlin
ProToast.custom(yourContext,"My Custom Toast",R.drawable.yourBackgroud,R.drawable.yourIcon,"yourColor",0)
```


## Inspiration

[Toasty](https://github.com/GrenderG/Toasty)
