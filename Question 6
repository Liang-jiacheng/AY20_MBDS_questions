# question 6

def read_file(filename):
    # read file of polygon and points
    res = []
    f = open(filename, 'r')
    for line in f:
        line = line.strip()
        if not line:
            continue
        x, y = line.split(' ')
        res.append((float(x), float(y)))
    f.close()
    return res

def sort_points_by_distance(x, y, polygon):
    #
    res = []
    for (px, py) in polygon:
        dis = (px - x) ** 2 + (py - y) ** 2
        res.append((px, py, dis))
    return sorted(res, key=lambda i: i[2])

def cal_the_symmetry_points(polygon_sorted, x, y):
    cx, cy = (polygon_sorted[0][0] + polygon_sorted[1][0]) / 2.0, \
             (polygon_sorted[0][1] + polygon_sorted[1][1]) / 2.0
    return (2 * cx - x, 2 * cy - y)

def cal_inside_or_not(symmetry_points, polygon_sorted, x, y):
    sx, sy = symmetry_points[0], symmetry_points[1]
    px, py = polygon_sorted[2][0], polygon_sorted[2][1]

    dis_s = (sx - px) ** 2 + (sy - py) ** 2
    dis_p = (x - px) ** 2 + (y - py) ** 2
    if dis_s > dis_p:
        return 'inside'
    else:
        return 'outside'

def calculate(polygon, points):
    #
    res = []

    for (x, y) in points:
        polygon_sorted = sort_points_by_distance(x, y, polygon)
        #print(polygon_sorted)
        symmetry_points = cal_the_symmetry_points(polygon_sorted, x, y)
        #print(symmetry_points)
        inside_or_outside = cal_inside_or_not(symmetry_points, polygon_sorted, x, y)
        #print(inside_or_outside)
        res.append(inside_or_outside)
    return res


if __name__ == '__main__':
    # polygon list
    polygon = read_file('../data/input_question_6_polygon')

    # point list
    points = read_file('../data/input_question_6_points')

    # calculate
    result = calculate(polygon, points)

    # print result
    with open('../data/output_question_6_result', 'w') as f:
        f.writelines('\n'.join(result))
    f.close()
