def bubble_sort_increasing_1(old_ar):
    arr = old_ar.copy()
    for i in range(len(arr)):
        for j in range(i, len(arr)):
            if i != j and arr[i] > arr[j]:
                arr[i], arr[j] = arr[j], arr[i]
    return arr


def bubble_sort_increasing_2(old_ar):
    arr = old_ar.copy()
    inner_cycle = True
    i = 0

    while inner_cycle:
        inner_cycle = False
        for j in range(i, len(arr)):
            if i != j and arr[i] > arr[j]:
                arr[i], arr[j] = arr[j], arr[i]
                inner_cycle = True
        i += 1
    return arr


def bubble_sort_decreasing_1(old_ar):
    arr = old_ar.copy()
    for i in range(len(arr)):
        for j in range(i, len(arr)):
            if i != j and arr[i] < arr[j]:
                arr[i], arr[j] = arr[j], arr[i]
    return arr


def bubble_sort_decreasing_2(old_ar):
    arr = old_ar.copy()
    inner_cycle = True
    i = 0

    while inner_cycle:
        inner_cycle = False
        for j in range(i, len(arr)):
            if i != j and arr[i] < arr[j]:
                arr[i], arr[j] = arr[j], arr[i]
                inner_cycle = True
        i += 1
    return arr


array = [20, 4, 5, 2, 5, 8, 5, 76, 43, 75, 75, 21, 75, 75, 31, 3, 5, 99, 7, 542, 544, 51451, 31, 52, 35, 61, 17, 74, 4]
print(bubble_sort_increasing_1(array))
print(bubble_sort_increasing_2(array))
print(bubble_sort_decreasing_1(array))
print(bubble_sort_decreasing_2(array))
