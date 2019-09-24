# What's New ?
- Showing Toast
- Button Click Handling
- Linking UI resource from XML to Java Code.
- Changing Image at Runtime


## Syntaxes:

#### Toast
```java
Toast.makeText(getApplicationContext(), "Text You Want to Show", Toast.LENGTH_SHORT).show;
```

#### Linking UI resource from XML in Java code

**Syntax**
```java
<TYPE> <VAR_NAME> = findViewById(R.id.<RESOURCE_ID>);
```

**Example:**
If you want to link Button from XML whose id is `buttonChangePic` then Code will be as...
```java
Button btnChangePic = findViewById(R.id.buttonChangePic);
```

#### Button Click Handling
```java
buttonChangePic.setOnClickListener(new View.OnClickListener() {
	public void onClick(View view) {
		// Do something here you want to perform after clicking on button.
	}
});
```

#### Change Image at runtime using `Resource` image 
imageView.setImageResource(R.drawable.imageName);