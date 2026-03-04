import time
import random

tempo_inicial = time.time()
'''for i in range(100):
    pass
print('Tempo decorrido: ', time.time() - tempo_inicial)'''

tempo_inicial = time.time()
lista1 = [i for i in range(10000)]

# 1
def getlast(n):
    return n[len(n) - 1]
tempo_inicial = time.time()
print(getlast(lista1))
print('Tempo decorrido: ', time.time() - tempo_inicial)
# R: O(1)

# 2
lista2 = [random.randint(0, 100) for _ in range(100)]
def count_pairs_equal(a):
    c = 0
    count = 0
    for i in range(len(a)):
        for j in range(i + 1, len(a)):
            count += 1
            if a[i] == a[j]:
                c += 1
    print(count)
    return c
tempo_inicial = time.time()
print(count_pairs_equal(lista2))
print('Tempo decorrido: ', time.time() - tempo_inicial)
# R: O(n^2)

# 3
lista3 = [random.randint(-100, 100) for _ in range(100)]
def has_zero_sum_triple(a):
    n = len(a)
    for i in range(n):
        for j in range(i + 1, n):
            for k in range(j + 1, n):
                if a[i] + a[j] + a[k] == 0:
                    return True
    return False
# R: O(n^3)

# 4
def some_search(a, target):
    lo, hi = 0, len(a) - 1
    while lo <= hi:
        mid = (lo + hi) // 2
        if a[mid] == target:
            return mid
        if a[mid] < target:
            lo = mid + 1
        else:
            hi = mid - 1
    return -1
# R: O(log(n))

# 5
def fib(n):
    if n <= 1:
        return n
    return fib(n - 1) + fib(n - 2)
# R: O(2^n)

# 6
def common_prefix(words):
    if not words:
        return ""
    p = words[0]
    for w in words[1:]:
        while not w.startswith(p):
            p = p[:-1]
            if p == "":
                return ""
    return p
# R: O(n log(n))

# 7
def count_hits(sorted_a, queries):
    hits = 0
    for q in queries:
        if binary_search(sorted_a, q) != -1:
            hits += 1
    return hits
# R:

# 8
def factorial(n):
    if n <= 1:
        return 1
    return n * factorial(n - 1)
# R: O(n)

# 9
def bubble_sort(a):
    a = a[:] # cópia
    n = len(a)
    for i in range(n):
        for j in range(0, n - 1 - i):
            if a[j] > a[j + 1:
                a[j], a[j + 1] == a[j + 1], a[j],
    return a
# R: O(n^2)

# 10
def perm(n):
    if n == 0:
        return 1
    total = 0
    for i in range(n):
        total += perm(n - 1)
    return total
# R:
