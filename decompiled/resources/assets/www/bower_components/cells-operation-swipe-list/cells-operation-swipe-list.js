/**
  `<cells-operation-swipe-list>` Description.

  Example:

  ```html
  <cells-operation-swipe-list></cells-operation-swipe-list>
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
  | --cells-operation-swipe-list | :host    | {} |

  * @customElement
  * @polymer
  * @extends {Polymer.Element}
  * @demo demo/index.html
*/
class CellsFrequentOperationList extends Polymer.mixinBehaviors([
  CellsBehaviors.i18nBehavior,
  CellsBehaviors.CellsCheckNestedKeysBehavior,
  CellsBehaviors.CellsTextFormatterBehavior
], Polymer.Element) {
  static get is() {
    return 'cells-operation-swipe-list';
  }

  static get properties() {
    return {
      items: {
        type: Array,
        value: null
      },
      actions: {
        type: Array,
        value: () => []
      },
      /**
      * Property to set configuration (text, icon, method, className) to swipe button for products
      */
      actionsProduct: {
        type: Array,
        value: () => []
      },
      info: {
        type: Object,
        value: () => ({})
      },
      /**
      * property to apply full-page styles
      */
      fullPage: {
        type: Boolean,
        value: false,
        reflectToAttribute: true
      },
      /**
      * If true divider between avatar items is not showed
      */
      noDivider: {
        type: Boolean,
        value: false,
      },
      /**
      * groupItems array
      */
      groupItems: {
        type: Array,
        value: null
      },
      /**
       * check if user has notifications disabled
       */
      notificationsDisabled: {
        type: Boolean,
        value: false
      },
      /**
       * Icon for disabled notifications info
       */
      infoIcon: {
        type: String,
        value: 'coronita:info'
      },
      /**
       * Size of the info icon
       */
      infoIconSize: {
        type: Number,
        value: 24
      },
      /**
       * Message for the info icon with disabled notifications
       */
      infoMessage: {
        type: String,
        value: 'cells-operation-swipe-list-disabled-notifications-info'
      },
      /**
       * Label for the button in disabled notification message
       */
      notificationsSettingsBtnLabel: {
        type: String,
        value: 'cells-operation-swipe-list-disabled-notifications-btn'
      },
      /**
       * Value to translate swipe container
       */
      transformValue: String,
      /**
       * If true, only one item is opened
       */
      disableDoubleSwipe: {
        type: Boolean,
        value: false
      },
      /**
       * Elements DOM of transactions
       */
      _swipeList: {
        type: Array,
        value: [],
      },
      /**
       * item index touched
       */
      itemIndexTouched: {
        type: Number,
        value: -1
      },
      /**
       * item index opened
       */
      itemIndexOpened: {
        type: Number,
        value: -1
      },
      /**
       * true when there is movement
       */
      moveInProgress: {
        type: Boolean,
        value: false
      },
      /**
       * Array of grouped avatars
       */
      avatarItems: {
        type: Array,
        value: () => ([])
      },
      /**
       * Flag to show/hide icon
       */
      showIcon: {
        type: Boolean,
        value: false
      },
      /**
       * Icon to show
       */
      icon: {
        type: String,
        value: 'coronita:add'
      },
      /**
       * type of the list
       */
      activeList: {
        type: String,
        value: 'items'
      },
      /**
       * change 'list__info' class
       */
      classInfoMessage: {
        type: String,
        value: 'list__info'
      },
      /**
       * Text to display as search result
       * @type {String}
       */
      resultsLabel: {
        type: String,
        value: ''
      },
      /**
       * footer spinner
       */
      spinner: {
        type: Boolean,
        value: false
      },
      /**
      * Currency
      */
      localCurrency: {
        type: String
      },
      /**
       * Text to display as button in header
       * @type {String}
       */
      headerButtonLabel: String,
      /**
       * Classes to apply in header button
       * @type {String}
       */
      headerButtonClasses: String
    };
  }

  /**
  * Reset item list
  */
  reset() {
    this.items = null;
    this.info = {};
    this.groupItems = null;
    this.notificationsDisabled = false;
    this.isGroupItemsDisabled = false;
    this.avatarItems = [];
  }

  /**
  * Send option selected
  */
  onClickOption(e) {
    if (!this.actions.length || e.target.hasAttribute('disabled') || e.target.parentNode.hasAttribute('disabled')) {
      return;
    }
    const activeItem = {
      items: 'item',
      groupItem: 'item',
      avatarItems: 'groupItem'
    };
    const { operation: productId, action } = (e.currentTarget || {}).dataset || {};
    const operationData = this.get(`model.__data.${activeItem[this.activeList]}`, e);
    const method = action ? action.toLowerCase() : {};
    const actionName = (method === 'run') ? 'execute' : method;
    this._fireEvent(`view-operation-swipe-${actionName}`, { productId, operationData });
  }

  /**
  * Send event with info when accept click
  */
  onAcceptClick() {
    this._fireEvent(this.info.event);
  }

  /**
   * Send event when secondary button is clicked
   */
  onSecondaryButtonClick() {
    const env = this.get('info.secondaryButton.event') || 'cells-operation-swipe-list-error-secondary-button-clicked';
    this._fireEvent(env);
  }

  /**
   * Receives the configuration of two buttons and return the cells-confirm-button configuration
   * @param {String} primaryButtonText
   * @param {Object} secondaryButton
   */
  _getButtonsConfig(primaryButtonText, secondaryButton) {
    let config = primaryButtonText ? {
      buttons: {
        primary: {
          class: 'primary',
          text: this.t(primaryButtonText)
        }
      }
    } : {};
    config.buttons = secondaryButton ? { ...(config || {}).buttons, secondary: secondaryButton } : config.buttons;
    return config;
  }

  /**
  * Send event when selected item
  */
  onItemSelected(e) {
    const itemId = ((((((e.currentTarget || {}).firstChild || {}).__dataHost || {}).__data || {}).item || {}).id) || {};
    this._fireEvent('checked-item', itemId);
  }

  /**
  * Navigate to notification settins
  */
  goToNotificationsSettings() {
    this._fireEvent('go-to-notification-settings');
  }

  /**
  * Method for dispatch events
  */
  _fireEvent(eventName, detail = null) {
    this.dispatchEvent(new CustomEvent(eventName, { bubbles: true, composed: true, detail: detail }));
  }

  /**
   * Handler for swipe start
   * Disables other items
   * @param {Event} ev
   */
  _onTouchStart(ev) {
    if (this.disableDoubleSwipe && !this._hasValue(this.itemIndexTouched)) {
      const itemIndex = this._getIndex(this.get('currentTarget', ev));
      this.itemIndexTouched = itemIndex;

      this._swipeList
        .filter((item) => this._getIndex(item) !== itemIndex)
        .forEach((item) => {
          item.disabled = true;
        });
    }
  }


  /**
   * Handler for swipe end
   * Restore disabled state after swipe ends
   * @param {Event} event
   */
  _onTouchEnd(env) {
    const itemIndex = this._getIndex(this.get('currentTarget', env));

    if (!this._hasValue(this.itemIndexOpened) && !this.moveInProgress) {
      const activeItem = {
        items: 'item',
        groupItem: 'item',
        avatarItems: 'groupItem'
      };
      this._fireEvent('tap-view-operation-detail', this.get(`model.__data.${activeItem[this.activeList]}`, env));
    }

    if (this._hasValue(this.itemIndexOpened) && itemIndex !== this.itemIndexOpened && !this.moveInProgress) {
      this._closeOpenItems(this._swipeList);
    }

    if (this.disableDoubleSwipe && itemIndex === this.itemIndexTouched) {
      this.itemIndexTouched = -1;
      this._swipeList.forEach((item) => {
        item.disabled = this._setDisabledSwipeItem(item);
      });
    }
  }

  _setDisabledSwipeItem(item) {
    if (this.activeList === 'avatarItems') {
      const dataGroup = item.getAttribute('data-group');
      const dataIndex = item.getAttribute('data-index');
      const findGroup = this[this.activeList].find(group => group.indexGroup === dataGroup);
      if (findGroup?.groupItem?.[dataIndex]?.hasActions) {
        return !findGroup?.groupItem?.[dataIndex]?.hasActions;
      }
      return false;
    } else {
      return !this[this.activeList][item.dataIndex].hasActions;
    }
  }

  /**
   * observe when object is opened/closed
   * @param {Event} event
   * @private
   */
  _onItemOpenChanged(env) {
    const isOpen = this.get('detail', env);
    this[`_onItem${isOpen ? 'Opened' : 'Closed'}`](env);
  }

  /**
   * Called when a item is open
   * @param {Event} event
   * @private
   */
  _onItemOpened(env) {
    const itemIndex = this._getIndex(this.get('currentTarget', env));
    const itemsToClose = this._swipeList
      .filter((item) => this._getIndex(item) !== itemIndex);

    this._closeOpenItems(itemsToClose);

    this.itemIndexOpened = itemIndex;
  }

  /**
   * Called when a item is close
   * @private
   */
  _onItemClosed() {
    this.itemIndexOpened = -1;
  }

  /**
   * close items that is open
   * @param {Array} items
   * @private
   */
  _closeOpenItems(items) {
    items
      .filter((item) => item.open)
      .forEach((item) => {
        item.open = false;
      });
  }

  /**
   * @returns {Array} with items HTML elements
   */
  _getAllItemsNodes(env) {
    const childClass = env.target.getAttribute('data-child-class');
    return Array.from(this.shadowRoot.querySelectorAll(`.${childClass}`));
  }

  /**
   * handler caching dom elements
   * @private
   */
  _onChangeTransactionList(env) {
    this._swipeList = this._getAllItemsNodes(env);
  }

  /**
   *  get index from a dom repeat
   * @param {HTMLElement} elementDom
   * @returns {String}
   * @private
   */
  _getIndex(elementDom) {
    return this.get('id', elementDom);
  }

  /**
   * Check that it has a valid value
   * @param {Number} value
   * @returns {boolean}
   * @private
   */
  _hasValue(value) {
    return !(value < 0);
  }

  /**
   * Set flag of move in progress
   * @private
   */
  _onMoveStart() {
    this.moveInProgress = true;
  }

  /**
   * Set flag of move in progress
   * @private
   */
  _onMoveEnd() {
    this.moveInProgress = false;
  }

  /**
   * Fires an event when clicking on icon
   */
  clickIcon() {
    this.dispatchEvent(new CustomEvent('cells-operation-swipe-list-icon-clicked', {
      bubbles: true,
      composed: true
    }));
  }

  _getIdSwipe(prefix, index) {
    return `${prefix}-${index}`;
  }

  /**
   * Scrolls view to a HTML element with given Id
   */
  scrollIntoItem(itemId) {
    const element = this.shadowRoot.querySelector(`#${this.capitalize(itemId)}`);
    if (element) {
      element.scrollIntoView();
    }
  }

  /**
   * Get 'day' or 'operations' properties.
   * Mainly used for compatibility reasons.
   * @param {object} groupItem
   * @private
   */
  _getNameElements(groupItem) {
    return groupItem.day || groupItem.operations;
  }

  /**
   * Disables just run button if operation is disabled
   * @param {Boolean} disabled
   * @param {Object} action
   */
  _checkIfDisabled(disabled, action) {
    return disabled && action.method === 'RUN';
  }

  _setAriaHidden(id, openId) {
    /* eslint-disable-next-line */
    return `${id != openId}`;
  }

  /**
   * Returns if an object is filled or not
   * @param {Object} item
   */
  _isFilled(item) {
    return item && Object.keys(item).length;
  }

  /**
   * Fires an event when clicking on header button text
   * @event cells-operation-swipe-list-header-button-clicked
   */
  _onHeaderButtonClick() {
    this._fireEvent('cells-operation-swipe-list-header-button-clicked');
  }
}

customElements.define(CellsFrequentOperationList.is, CellsFrequentOperationList);
