def insertion_sort_increasing_1(old_ar):
    arr = old_ar.copy()

    for j in range(1, len(arr)):
        key = arr[j]
        i = j - 1
        while i >= 0 and key < arr[i]:
            arr[i + 1] = arr[i]
            i -= 1
        arr[i + 1] = key
    return arr


def insertion_sort_decreasing_1(old_ar):
    arr = old_ar.copy()

    for j in range(1, len(arr)):
        key = arr[j]
        i = j - 1
        while i >= 0 and key > arr[i]:
            arr[i + 1] = arr[i]
            i -= 1
        arr[i + 1] = key
    return arr


array = [20, 4, 5, 2, 5, 8, 5, 76, 43, 75, 75, 21, 75, 75, 31, 3, 5, 99, 7, 542, 544, 51451, 31, 52, 35, 61, 17, 74, 4]
print(insertion_sort_increasing_1(array))
print(insertion_sort_decreasing_1(array))
