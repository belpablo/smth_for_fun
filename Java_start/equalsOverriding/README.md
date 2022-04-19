Дан класс ComplexNumber. Переопределите в нем методы equals() и hashCode() так, чтобы equals() сравнивал экземпляры ComplexNumber по содержимому полей re и im, а hashCode() был бы согласованным с реализацией equals().

# Пример

```Java
ComplexNumber a = new ComplexNumber(1, 1);
ComplexNumber b = new ComplexNumber(1, 1);
// a.equals(b) must return true
// a.hashCode() must be equal to b.hashCode()
```

# Чем пользовался в процессе решения:

https://habr.com/ru/post/168195/

https://github.com/qcha/JBook/blob/master/object/hashcode.md

