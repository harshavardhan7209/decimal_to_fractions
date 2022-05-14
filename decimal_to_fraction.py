import math
def main():
    main.a = int(input("Enter the integer part of the number: "))
    main.i=input("Enter the non-repeating decimal part: ")
    main.b=input("Enter the infinite decimal part: ")
    bb = len(main.b)
    ii = len(main.i)
    if main.b!="":
       c=int(str(main.a)+str(main.i)+str(main.b))
       jj = bb+ii
       if main.i=="":
        d= int(math.pow(10,bb)-1)
        za=c-main.a
       else:
        d= int(math.pow(10,jj)-math.pow(10,(ii)))
        za=c-int(str(main.a)+str(main.i))
       e=math.gcd(za,d)
       main.f=str(int((za)/e))+"/"+str(int(d/e))
    else:
        c = int(str(main.a) + str(main.i))
        d = int(math.pow(10, ii))
        e = math.gcd(c,d)
        main.f = str(int(c/e)) + "/"+str(int(d/e))
    for i in range(len("You have entered " + str(main.a)+"."+main.i)+1):
        print(" ", end="")
    for i in range(len(main.b)):
        print("_", end='')
    print()
    l = str(main.a)+"."+main.i+main.b
    print("You have entered: " + l)
    print("Fraction is: "+str(main.f))

main()
while True:
    x = input("Do you want to continue(Y/N): ")
    if x == "y":
        main()
    else:
        break