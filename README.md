# ChangeThemeSmoothly
It's a simple demo to show a simple way to chagne activity theme smoothly.

# How
just 6 simple steps:

+ create theme_attr.xml in values folder.add some attr elements you want.
+ define the specific value of attrs in the theme_attr.xml for each theme you may use. Such as darktheme, lighttheme.
+ use `?attr` in ui xml files.
+ read theme settings after `super.onCreate(..)` before `setContentView(..)` and call `setTheme(..)` too.
+ want to change theme? save theme settings, and call `recreate()` or `finish();startActivity(intentToSelf);`
+ want smoothly? define window animation as fade_in and fade_out for each theme you may use.

