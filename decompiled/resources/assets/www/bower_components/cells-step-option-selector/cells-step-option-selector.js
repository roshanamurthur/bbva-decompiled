{
  const {
    html,
  } = Polymer;
  /**
    `<cells-step-option-selector>` Description.

    Example:

    ```html
    <cells-step-option-selector></cells-step-option-selector>
    ```

    ## Styling
    The following custom properties and mixins are available for styling:

    ### Custom Properties
    | Custom Property     | Selector | CSS Property | Value       |
    | ------------------- | -------- | ------------ | ----------- |
    | --cells-fontDefault | :host    | font-family  |  sans-serif |
    ### @apply
    | Mixins    | Selector | Value |
    | --------- | -------- | ----- |
    | --cells-step-option-selector | :host    | {} |

    * @customElement cells-step-option-selector
    * @polymer
    * @extends {Polymer.Element}
    * @demo demo/index.html
  */
  class CellsStepOptionSelector extends Polymer.mixinBehaviors([CellsBehaviors.i18nBehavior, CellsBehaviors.StepBehavior,
    CellsBehaviors.CellsCheckNestedKeysBehavior], Polymer.Element) {
    static get is() {
      return 'cells-step-option-selector';
    }

    static get properties() {
      return {
        /**
        * The items object stores data of diferent sections of the component to render in the dom
        * @type {Object}
        */
        items: {
          type: Object,
          value: () => ({
            header: [],
            options: [],
            sticky: [],
            footer: [],
            filled: [],
            info: [],
            link: {}
          })
        },
        /**
        * Activate or deactivate the sticky
        * @type {Boolean}
        */
        showSticky: {
          type: Boolean,
          value: false,
          observer: '_stickyConfig'
        },
        /**
        * Activate or deactivate the margin bottom
        * @type {Boolean}
        */
        spacingKeyValues: {
          type: Boolean,
          value: false,
          observer: '_spacingConfig'
        },
        /**
        * The amount currency when collapsed
        * @type {String}
        */
        summaryCurrency: {
          type: String,
          value: '$'
        },
        /**
        * Activate or deactivate the button step
        * @type {Boolean}
        */
        enableButton: {
          type: Boolean,
          value: false
        },
        /**
        * Amount when collapsed
        * @type {Number}
        */
        amountFilled: {
          type: Number,
          value: 10
        },
        /**
        * Variable to set the step active
        * @type {Boolean}
        */
        active: {
          type: Boolean,
          value: false,
          reflectToAttribute: true
        },
        /**
         * Flag to show/hide the step's title
         * @type {Boolean}
        */
        hideHeader: {
          type: Boolean,
          value: false
        },
        /**
         * Step's title
         * @type {String}
        */
        stepTitle: {
          type: String,
          value: 'cells-step-user-form-title-step'
        },
        /**
         * Variable to collapse the step
         * @type {Boolean}
        */
        collapsed: {
          type: Boolean,
          value: false,
          reflectToAttribute: true
        },
        /**
         * Set summary class
         * @type {String}
        */
        stickySummaryClass: {
          type: String,
          value: 'sticky-summary'
        },
        /**
         *local currency
         */
        localCurrency: {
          type: String
        },
        /**
         *show hader title collapsed
         */
        showHeaderTitle: {
          type: Boolean,
          value: false
        },
        /**
         *class for oc banner
         */
        classOcBanner: {
          type: String
        },
        /**
         * Flag to show image text
         */
        imageAmountCover: {
          type: Boolean,
          value: false
        },
        /**
         * Flag to show or hidde options select
         */
        hiddenOptions: {
          type: Boolean,
          value: false,
        },
        /**
         * Class to key values when is colapsed
         * @type {String}
         */
        keyValueCollapsedClass: {
          type: String,
          value: 'spacing-key-values'
        },
        /**
         * Flag to show or hide the step title
         * @type {Boolean}
         */
        isHiddenStepTitle: {
          type: Boolean,
          value: false
        },
        /**
         * The computed value relies on the states of `items` and `hiddenStepTitle` properties.
         * @type {Boolean}
         */
        _showStepTitle: {
          type: Boolean,
          computed: '_computeShowStepTitle(items, isHiddenStepTitle)'
        }
      };
    }

    /**
     * Change the amount
     * @public
     * @param {Number} amount
     */
    setOperationAmount(amount) {
      this.set('items.sticky.0.operation.amount.amount', amount);
      this.set('items.filled.0.amount', amount);
    }

    /**
     * Show or hide the step title
     * @public
     * @param {Boolean} isHiddenStepTitle
     * @param {Array} items
     * @returns {Boolean}
     */
    _computeShowStepTitle(items, isHiddenStepTitle) {
      return items.header?.[0]?.title && !isHiddenStepTitle;
    }

    /**
     * Change the value of a key value component by its id
     * @public
     * @param {Object} obj
     * @example {id: 'keyValue01', value: 'Lorem Ipsum'}
     */
    setKeyValue(obj) {
      this.get('items.filled.0.keyValue').forEach((key, index) => {
        if (this.get('key', obj) === this.get('key', key)) {
          this.set(`items.filled.0.keyValue.${index}.value`, obj.value);
        } else {
          return;
        }
      });
    }

    /**
     * Change the summary title of the sticky
     * @public
     * @param {String} title
     */
    setSummaryTitle(title) {
      this.set('items.sticky.0.summaryViewTitle', title);
      this.root.querySelector('cells-sticky-container').calculateHeight();
    }
    /**
     * Change the additionalText of the sticky
     * @public
     * @param {String} additionalText
     */
    setAdditionalText(additionalText) {
      this.set('items.sticky.0.operation.additionalText.key', additionalText);
      this.root.querySelector('cells-sticky-container').calculateHeight();
    }

    /**
     * Show the sticky
     * @public
     */
    setShowSticky() {
      this.showSticky = true;
    }

    /**
     * Active the button
     * @public
     */
    activeButton() {
      this.enableButton = true;
    }

    /**
     * toggles on and off the sticky
     * @private
     */
    _stickyConfig(showSticky) {
      if (showSticky) {
        this.setAttribute('sticky-show', true);
      } else {
        this.removeAttribute('sticky-show');
      }
    }

    /**
     * toggles on and off the margin bottom
     * @private
     */
    _spacingConfig(spacingKeyValues) {
      if (spacingKeyValues) {
        this.setAttribute('spacing-key-values', true);
      } else {
        this.removeAttribute('spacing-key-values');
      }
    }

    /**
     * Collapse the step
     * @private
     * @event continue-pressed
     */
    _handleButtonEvent() {
      this.collapsed = true;
      this._fireEvent('continue-pressed', true);
    }

    /**
     * reset component state
     * @public
     */
    reset() {
      this.showSticky = false;
      this.enableButton = false;
      this.root.querySelector('cells-aggregation-card-select').reset();
    }
    /**
     * click on the link text and dispatch event
     */
    _linkClick() {
      this._fireEvent('cells-aggregation-link-clicked', this.c(this.items, 'link.0.text', ''));
    }

    /**
     * Uncollapse the step
     * @private
     * @event change-step-state
     */
    _onChangePressed() {
      this.collapsed = false;
      this.hideHeader = this.showHeaderTitle ? false : true;
      this._fireEvent('change-step-state', this);
    }

    /**
    * Validates step in the step-behaviour component
    * @returns {Boolean}
    */
    isValid() {
      return this.collapsed;
    }

    /**
     * Dispatches a custom event with a name and a detail
     * @private
     * @param {String} nameEvent
     * @param {Object} detail
     */
    _fireEvent(nameEvent, detail) {
      this.dispatchEvent(new CustomEvent(nameEvent, {
        bubbles: true,
        composed: true,
        detail: detail
      }));
    }
  }

  customElements.define(CellsStepOptionSelector.is, CellsStepOptionSelector);
}