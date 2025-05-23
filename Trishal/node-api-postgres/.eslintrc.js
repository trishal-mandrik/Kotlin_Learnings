module.exports = {
  'env': {
    'browser': true,
    'commonjs': true,
    'es2021': true,
  },
  'extends': 'google',
  'overrides': [
    {
      'env': {
        'node': true,
      },
      'files': [
        '.eslintrc.{js,cjs}',
      ],
      'parserOptions': {
        'sourceType': 'script',
      },
    },
  ],
  'parserOptions': {
    'ecmaVersion': 'latest',
  },
  "rules": {
    "no-useless-escape": 0,
    "linebreak-style": 0,
    "quotes":0,
    "arrow-parens":0,
    "no-tabs":0,
    "no-dupe-keys":0,
    "max-len": 0,
    "no-param-reassign": 0,
    "no-unneeded-ternary": 0,
    "arrow-body-style": 0,
    "key-spacing": 0,
    "new-cap": 0,
    "class-methods-use-this": 0,
    "prefer-template": 0,
    "quote-props": 0,
    "prefer-arrow-callback": 0,
    "indent": [
      2,
      2,
      {
        "SwitchCase": 1
      }
    ],
    "space-before-function-paren": [
      2,
      {
        "anonymous": "always",
        "named": "never"
      }
    ],
    "no-use-before-define": [
      2,
      "nofunc"
    ],
    // TODO: turn on later
    "comma-dangle": [
      0
    ],
    "prefer-destructuring": ["error", {"object": false, "array": false}],
    "import/no-extraneous-dependencies": 0,
    "switch-colon-spacing": 0,
    "object-curly-spacing": 0,
    "require-jsdoc":0,
    "valid-jsdoc":0,
    "no-invalid-this": 0
  },
  "env": {
    "node": true,
    "browser": true,
    "mocha": true,
    "es2017": true
  },
  "extends": ["eslint:recommended", "google"],
  "parserOptions": {
    "sourceType": "module",
    "ecmaVersion": 2020
  },
};
