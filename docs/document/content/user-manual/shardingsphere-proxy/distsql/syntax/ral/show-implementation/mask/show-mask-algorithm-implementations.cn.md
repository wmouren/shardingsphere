+++
title = "SHOW MASK ALGORITHM IMPLEMENTATIONS"
weight = 1
+++

### 描述

`SHOW MASK ALGORITHM IMPLEMENTATIONS` 语法用于查询 `org.apache.shardingsphere.mask.spi.MaskAlgorithm` 接口所有具体的实现类。

### 语法

{{< tabs >}}
{{% tab name="语法" %}}
```sql
showMaskAlgorithmImplementations ::=
  'SHOW' 'MASK' 'ALGORITHM' 'IMPLEMENTATIONS'
```
{{% /tab %}}
{{% tab name="铁路图" %}}
<iframe frameborder="0" name="diagram" id="diagram" width="100%" height="100%"></iframe>
{{% /tab %}}
{{< /tabs >}}

### 返回值说明

| 列    | 说明      |
|------|---------|
| name | 实现类名称   |
| type | 类型      |
| class_path | 实现类完整路径 |

### 示例

- 查询 `org.apache.shardingsphere.mask.spi.MaskAlgorithm` 接口的所有实现类

```sql
SHOW MASK ALGORITHM IMPLEMENTATIONS
```

```sql
SHOW MASK ALGORITHM IMPLEMENTATIONS;
+------------------------------------+------------------------------+-------------------------------------------------------------------------------------+
| name                               | type                         | class_path                                                                          |
+------------------------------------+------------------------------+-------------------------------------------------------------------------------------+
| MD5MaskAlgorithm                   | MD5                          | org.apache.shardingsphere.mask.algorithm.hash.MD5MaskAlgorithm                      |
| KeepFirstNLastMMaskAlgorithm       | KEEP_FIRST_N_LAST_M          | org.apache.shardingsphere.mask.algorithm.cover.KeepFirstNLastMMaskAlgorithm         |
| KeepFromXToYMaskAlgorithm          | KEEP_FROM_X_TO_Y             | org.apache.shardingsphere.mask.algorithm.cover.KeepFromXToYMaskAlgorithm            |
| MaskAfterSpecialCharsAlgorithm     | MASK_AFTER_SPECIAL_CHARS     | org.apache.shardingsphere.mask.algorithm.cover.MaskAfterSpecialCharsAlgorithm       |
| MaskBeforeSpecialCharsAlgorithm    | MASK_BEFORE_SPECIAL_CHARS    | org.apache.shardingsphere.mask.algorithm.cover.MaskBeforeSpecialCharsAlgorithm      |
| MaskFirstNLastMMaskAlgorithm       | MASK_FIRST_N_LAST_M          | org.apache.shardingsphere.mask.algorithm.cover.MaskFirstNLastMMaskAlgorithm         |
| MaskFromXToYMaskAlgorithm          | MASK_FROM_X_TO_Y             | org.apache.shardingsphere.mask.algorithm.cover.MaskFromXToYMaskAlgorithm            |
| GenericTableRandomReplaceAlgorithm | GENERIC_TABLE_RANDOM_REPLACE | org.apache.shardingsphere.mask.algorithm.replace.GenericTableRandomReplaceAlgorithm |
+------------------------------------+------------------------------+-------------------------------------------------------------------------------------+
8 rows in set (0.13 sec)
```

### 保留字

`SHOW`、`MASK`、`ALGORITHM`、`IMPLEMENTATIONS`

### 相关链接

- [保留字](/cn/user-manual/shardingsphere-proxy/distsql/syntax/reserved-word/)