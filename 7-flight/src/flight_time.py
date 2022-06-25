def flight_calculation():
    def get_time():
        Time=input().split(" ")
        h1=int(Time[0][0:2])
        m1=int(Time[0][3:5])
        s1=int(Time[0][6:8])
        h2=int(Time[1][0:2])
        m2=int(Time[1][3:5])
        s2=int(Time[1][6:8])
        d=0
        if(len(Time)==3):
            d=int(Time[2][2])
        return (h2*3600+m2*60+s2)-(h1*3600+m1*60+s1)+d*24*3600
    t=(get_time()+get_time())/2
    h=int(t/3600)
    m=int(t/60%60)
    s=int(t%60)
    print("{:0>2d}:{:0>2d}:{:0>2d}".format(h,m,s))

