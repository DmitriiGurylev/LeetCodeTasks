def merge_sort_increasing_1(old_ar):
    def merge(arr, left, right):
        if (left < right):
            mid = left + (right - left) // 2
            merge(arr, left, mid)
            merge(arr, mid + 1, right)

            unite(arr, left, mid, right)
        return arr

    def unite(arr, left, mid, right):
        len_left = mid - left + 1
        len_right = right - mid

        arr_left = []
        arr_right = []

        # заполнение массивов
        for i in range(len_left):
            arr_left += [arr[left + i]]
        for i in range(len_right):
            arr_right += [arr[mid + i + 1]]

        left_i = 0
        right_i = 0

        for k in range(left, right+1):
            if left_i == len_left:
                arr[k] = arr_right[right_i]
                right += 1
            elif right_i == len_right:
                arr[k] = arr_left[left_i]
                left += 1

            elif arr_left[left_i] < arr_right[right_i]:
                arr[k] = arr_left[left_i]
                left_i += 1
            else:
                arr[k] = arr_right[right_i]
                right_i += 1
        return arr



    arr = old_ar.copy()

    return merge(arr, 0, len(arr) - 1)


# сначала надо разделить массив


array = [20, 4, 5, 2, 5, 8, 5, 76, 43, 75, 75, 21, 75, 75, 31, 3, 5, 99, 7, 542, 544, 51451, 31, 52, 35, 61, 17, 74, 4]
print(merge_sort_increasing_1(array))
