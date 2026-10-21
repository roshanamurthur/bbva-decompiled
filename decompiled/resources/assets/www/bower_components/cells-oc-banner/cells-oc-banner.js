/**
 *
 * `<cells-oc-banner>` shows a banner with a config info.
 *
 *
 * ```html
 * <cells-oc-banner></cells-oc-banner>
 * ```
 * ## Styling
 *
 * The following custom properties and mixins are available for styling:
 *
 * ### Custom Properties
 * | Custom Property                                     | Selector                                                                    | CSS Property                        | Value                                                            |
 * | --------------------------------------------------- | --------------------------------------------------------------------------- | ----------------------------------- | ---------------------------------------------------------------- |
 * | --cells-fontDefault                                 | :host                                                                       | font-family                         | sans-serif                                                       |
 * | --cells-oc-banner-iron-collapse-transition-duration | #collapse                                                                   | --iron-collapse-transition-duration | 1000ms                                                           |
 * | --cells-oc-banner-iron-open-animation-duration      | :host(.animated) .banner-opened                                             | animation                           | fadeIn ease  1s                                                  |
 * | --cells-text-size-ml                                | .banner__header                                                             | font-size                           | 0.9375rem                                                        |
 * | --cells-text-size-ml                                | :host(.sustainable) .banner__title                                          | font-size                           | 0.75rem                                                          |
 * | --colorsSecondary600                                | .banner__header                                                             | color                               | #666666                                                          |
 * | --bbva-200                                          | .banner__hero                                                               | background-color                    | ![#E9E9E9](https://placehold.it/15/E9E9E9/000000?text=+) #E9E9E9 |
 * | --bbva-white                                        | .banner                                                                     | background-color                    | ![#fff](https://placehold.it/15/fff/000000?text=+) #fff          |
 * | --cells-text-size-xl                                | .banner__title                                                              | font-size                           | 1.125rem                                                         |
 * | --bbva-500                                          | .banner__date                                                               | color                               | ![#666](https://placehold.it/15/666/000000?text=+) #666          |
 * | --cells-text-size-xs                                | .banner__date                                                               | font-size                           | 0.75rem                                                          |
 * | --cells-text-size-ml                                | .card__link                                                                 | font-size                           | 0.9375rem                                                        |
 * | --cells-text-size-m                                 | .banner__subHeader                                                          | font-size                           | 0.875rem                                                         |
 * | --cells-oc-banner-description-amount-margin-right   | .banner .description-amount                                                 | margin-right                        | 0.3125rem                                                        |
 * | --cells-oc-banner-subHeader-margin-left             | .banner__subHeader                                                          | margin-left                         | 1rem                                                             |
 * | --cells-oc-banner-subHeader-margin-top              | .banner__subHeader                                                          | margin-top                          | 0rem                                                             |
 * | --cells-oc-banner-subHeader-margin-bottom           | .banner__subHeader                                                          | margin-bottom                       | 0rem                                                             |
 * | --cells-oc-banner-cardLink-margin-top               | .card__link                                                                 | margin-top                          | 0.5rem                                                           |
 * | --cells-oc-banner-cardLink-margin-right             | .card__link                                                                 | margin-right                        | 0rem                                                             |
 * | --cells-oc-banner-cardLink-line-height              | .card__link                                                                 | line height                         | 1.313rem                                                         |
 * | --cells-oc-banner-cardLink-padding-top              | .card__link                                                                 | padding-top                         | 0rem                                                             |
 * | --cells-oc-banner-cardLink-padding-right            | .card__link                                                                 | padding-right                       | 1.875rem                                                         |
 * | --cells-oc-banner-cardLink-padding-bottom           | .card__link                                                                 | padding-bottom                      | 0rem                                                             |
 * | --cells-oc-banner-cardLink-padding-left             | .card__link                                                                 | padding-left                        | 0rem                                                             |
 * | --cells-oc-banner-bannerHeader-padding-top          | .card__link                                                                 | padding-top                         | 0rem                                                             |
 * | --cells-oc-banner-bannerHeader-padding-right        | .card__link                                                                 | padding-right                       | 0.5rem                                                           |
 * | --cells-oc-banner-bannerHeader-padding-bottom       | .card__link                                                                 | padding-bottom                      | 0rem                                                             |
 * | --cells-oc-banner-bannerHeader-padding-left         | .card__link                                                                 | padding-left                        | 0rem                                                             |
 * | --cells-oc-banner-bannerHero-padding-top            | .banner__hero                                                               | padding-top                         | 0.5rem                                                           |
 * | --cells-oc-banner-bannerHero-padding-right          | .banner__hero                                                               | padding-right                       | 0.5rem                                                           |
 * | --cells-oc-banner-bannerHero-padding-bottom         | .banner__hero                                                               | padding-bottom                      | 0.5rem                                                           |
 * | --cells-oc-banner-bannerHero-padding-left           | .banner__hero                                                               | padding-left                        | 1rem                                                             |
 * | --cells-oc-banner-bannerMain-padding-top            | .banner__main                                                               | padding-top                         | 0.5rem                                                           |
 * | --cells-oc-banner-bannerMain-padding-right          | .banner__main                                                               | padding-right                       | 1rem                                                             |
 * | --cells-oc-banner-bannerMain-padding-bottom         | .banner__main                                                               | padding-bottom                      | 0.5rem                                                           |
 * | --cells-oc-banner-bannerMain-padding-left           | .banner__main                                                               | padding-left                        | 0rem                                                             |
 * | --cells-oc-banner-bannerExit-padding-top            | .banner__exit                                                               | padding-top                         | 0.5rem                                                           |
 * | --cells-oc-banner-bannerExit-padding-right          | .banner__exit                                                               | padding-right                       | 0.25rem                                                          |
 * | --cells-oc-banner-bannerExit-padding-bottom         | .banner__exit                                                               | padding-bottom                      | 0rem                                                             |
 * | --cells-oc-banner-bannerExit-padding-left           | .banner__exit                                                               | padding-left                        | 0rem                                                             |
 * | --cells-oc-banner-bannerImage-margin-top            | .banner__image                                                              | margin-top                          | 0rem                                                             |
 * | --cells-oc-banner-bannerImage-margin-left           | .banner__image                                                              | margin-left                         | 0rem                                                             |
 * | --cells-oc-banner-image-hero-background-color       | :host(.sustainable) .banner__hero                                           | background-color                    | --bbva-dark-aqua                                                 |
 * | --cells-text-size-xxl                               | cells-atom-amount > --cells-atom-amount-integer:                            | font-size                           | 1.25rem                                                          |
 * | --cells-text-size-xxl                               | cells-atom-amount > --cells-atom-amount-fractional:                         | font-size                           | 1.25rem                                                          |
 * | --cells-text-size-xs                                | cells-atom-amount > --cells-atom-amount-currency:                           | font-size                           | 0.75rem                                                          |
 * | --cells-text-size-xxl                               | cells-atom-amount > --cells-atom-amount-separator:                          | font-size                           | 1.25rem                                                          |
 * | --cells-text-size-ml                                | :host(.banner--product) .banner__main .banner__description                  | font-size                           | 0.9375rem                                                        |
 * | --bbva-600                                          | :host(.banner--product) .banner__main .banner__description                  | color                               | ![#121212](https://placehold.it/15/121212/000000?text=+) #121212 |
 * | --cells-text-size-m                                 | :host(.banner--product) .banner__main .banner__text                         | font-size                           | 0.875rem                                                         |
 * | --bbva-600                                          | :host(.banner--product) .banner__main .banner__text                         | color                               | ![#121212](https://placehold.it/15/121212/000000?text=+) #121212 |
 * | --cells-text-size-ml                                | :host(.banner--product) .banner__main .banner__link                         | font-size                           | 0.9375rem                                                        |
 * | --bbva-dark-medium-blue                             | :host(.banner--special)                                                     | --cells-st-button-bg-color          | ![#1973b8](https://placehold.it/15/1973b8/000000?text=+) #1973b8 |
 * | --cells-oc-banner-special-hero-padding-top          | :host(.banner--special) .banner__hero                                       | padding-top                         | 1.5rem                                                           |
 * | --cells-oc-banner-special-hero-padding-right        | :host(.banner--special) .banner__hero                                       | padding-right                       | 1rem                                                             |
 * | --cells-oc-banner-special-hero-padding-left         | :host(.banner--special) .banner__hero                                       | padding-left                        | 1rem                                                             |
 * | --cells-oc-banner-special-hero-padding-bottom       | :host(.banner--special) .banner__hero                                       | padding-bottom                      | 0rem                                                             |
 * | --cells-oc-banner-special-date-margin-bottom        | :host(.banner--special) .banner__main .banner__date                         | margin-bottom                       | 0.5rem                                                           |
 * | --cells-text-size-xl                                | :host(.banner--special) .banner__main .banner__description                  | font-size                           | 1.125rem                                                         |
 * | --bbva-600                                          | :host(.banner--special) .banner__main .banner__description                  | color                               | ![#121212](https://placehold.it/15/121212/000000?text=+) #121212 |
 * | --cells-text-size-ml                                | :host(.banner--special) .banner__main .banner__text                         | font-size                           | 0.9375rem                                                        |
 * | --bbva-500                                          | :host(.banner--special) .banner__main .banner__text                         | color                               | ![#666](https://placehold.it/15/666/000000?text=+) #666          |
 * | --cells-text-size-ml                                | :host(.banner--special) .banner__text                                       | font-size                           | 0.9375rem                                                        |
 * | --bbva-500                                          | :host(.banner--special) .banner__text                                       | color                               | ![#666](https://placehold.it/15/666/000000?text=+) #666          |
 * | --bbva-500                                          | :host(.banner--special) .banner__amount                                     | color                               | ![#666](https://placehold.it/15/666/000000?text=+) #666          |
 * | --cells-text-size-ml                                | :host(.banner--special) cells-atom-amount > --cells-atom-amount-integer:    | font-size                           | 0.9375rem                                                        |
 * | --cells-text-size-ml                                | :host(.banner--special) cells-atom-amount > --cells-atom-amount-fractional: | font-size                           | 0.9375rem                                                        |
 * | --cells-text-size-ml                                | :host(.banner--special) cells-atom-amount > --cells-atom-amount-currency:   | font-size                           | 0.9375rem                                                        |
 * | --cells-text-size-ml                                | :host(.banner--special) cells-atom-amount > --cells-atom-amount-separator:  | font-size                           | 0.9375rem                                                        |
 * | --cells-text-size-ml                                | :host(.sustainable) .banner__title                                          | font-size                           | 0.75rem                                                          |
 * | --cells-text-size-super-l                           | :host(.remember) cells-atom-amount > --cells-atom-amount-integer:           | font-size                           | 2rem                                                             |
 * | --cells-text-size-super-l                           | :host(.remember) cells-atom-amount > --cells-atom-amount-fractional:        | font-size                           | 2rem                                                             |
 * | --cells-text-size-xxl                               | :host(.remember) cells-atom-amount > --cells-atom-amount-currency:          | font-size                           | 1.25rem                                                          |
 * | --cells-text-size-super-l                           | :host(.remember) cells-atom-amount > --cells-atom-amount-separator:         | font-size                           | 2rem                                                             |
 * | --bbva-medium-blue                                  | :host(:not(.banner--special)) .banner__link                                 | color                               | ![#237ABA](https://placehold.it/15/237ABA/000000?text=+) #237ABA |
 * | --bbva-medium-blue                                  | .card__link                                                                 | color                               | ![#237ABA](https://placehold.it/15/237ABA/000000?text=+) #237ABA |
 * | --bbva-500                                          | :host(.banner--minimalist) .banner__image                                   | color                               | ![#666](https://placehold.it/15/666/000000?text=+) #666          |
 * | --cells-text-size-ml                                | :host(.banner--minimalist) .banner__text                                    | font-size                           | 0.9375rem                                                        |
 * | --bbva-500                                          | :host(.banner--minimalist) .banner__text                                    | color                               | ![#666](https://placehold.it/15/666/000000?text=+) #666          |
 * | --bbva-white-light-blue                             | :host(.banner--info) .banner__hero                                          | background-color                    | --bbva-white-light-blue                                          |
 * | --cells-text-weight-light                           | :host(.sustainable) .banner__title                                          | font-weight                         | 300                                                              |
 * ### @apply
 * | Mixins                                         | Selector                                                   | Value |
 * | ---------------------------------------------- | ---------------------------------------------------------- | ----- |
 * | --cells-oc-banner                              | :host                                                      | {}    |
 * | --cells-fontDefaultMedium                      | .banner__header                                            | {}    |
 * | --cells-oc-banner-header                       | .banner__header                                            | {}    |
 * | --cells-oc-banner-hero                         | .banner__hero                                              | {}    |
 * | --cells-oc-banner-main                         | .banner__main                                              | {}    |
 * | --cells-oc-banner-banner                       | .banner                                                    | {}    |
 * | --cells-oc-banner__banner__image               | .banner__image                                             | {}    |
 * | --cells-fontDefaultMedium                      | .banner__title                                             | {}    |
 * | --cells-fontDefaultMedium                      | .banner__description                                       | {}    |
 * | --cells-fontDefaultMediumItalic                | .banner__date                                              | {}    |
 * | --cells-oc-banner-exit                         | .banner__exit                                              | {}    |
 * | --cells-oc-banner-show-header                  | :host([show-header][no-close])                             | {}    |
 * | --cells-oc-banner-show-sub-header              | :host([show-sub-header])                                   | {}    |
 * | --cells-oc-banner-no-close                     | :host([no-close])                                          | {}    |
 * | --cells-oc-banner-date                         | cells-atom-date                                            | {}    |
 * | --cells-oc-banner-product                      | :host(.banner--product)                                    | {}    |
 * | --cells-oc-banner-product-banner               | :host(.banner--product) .banner                            | {}    |
 * | --cells-oc-banner-product-main                 | :host(.banner--product) .banner__main                      | {}    |
 * | --cells-oc-banner-product-description          | :host(.banner--product) .banner__main .banner__description | {}    |
 * | --cells-oc-banner-product-text                 | :host(.banner--product) .banner__main .banner__text        | {}    |
 * | --cells-oc-banner-button                       | :host(.banner--product) .banner__main .banner__button      | {}    |
 * | --cells-oc-banner-product-link                 | :host(.banner--product) .banner__main .banner__link        | {}    |
 * | --cells-oc-banner-special                      | :host(.banner--special)                                    | {}    |
 * | --cells-oc-banner-special-banner               | :host(.banner--special) .banner                            | {}    |
 * | --cells-oc-banner-special-main                 | :host(.banner--special) .banner__main                      | {}    |
 * | --cells-oc-banner-special-description          | :host(.banner--special) .banner__main .banner__description | {}    |
 * | --cells-oc-banner-special-text                 | :host(.banner--special) .banner__main .banner__text        | {}    |
 * | --cells-oc-banner-special-link                 | :host(.banner--special) .banner__main .banner__link        | {}    |
 * | --cells-oc-banner-not-special                  | :host(:not(.banner--special))                              | {}    |
 * | --cells-oc-banner-product-special              | :host(.banner--product.banner--special)                    | {}    |
 * | --cells-oc-banner-minimalist                   | :host(.banner--minimalist)                                 | {}    |
 * | --cells-oc-banner-minimalist-banner            | :host(.banner--minimalist) .banner                         | {}    |
 * | --cells-oc-banner-minimalist-banner-hero       | :host(.banner--minimalist) .banner__hero                   | {}    |
 * | --cells-oc-banner-minimalist-banner-image      | :host(.banner--minimalist) .banner__image                  | {}    |
 * | --cells-oc-banner-minimalist-banner-main       | :host(.banner--minimalist) .banner__main                   | {}    |
 * | --cells-oc-banner-minimalist-banner-text       | :host(.banner--minimalist) .banner__text                   | {}    |
 * | --cells-oc-banner-light-blue-hero-image-hero   | :host(.banner--info) .banner__hero                         | {}    |
 **/

class CellsOcBanner extends Polymer.mixinBehaviors([ CellsBehaviors.i18nBehavior ], Polymer.Element) {
  static get is() {
    return 'cells-oc-banner';
  }

  static get properties() {
    return {

      /**
       * Config
       */
      config: {
        type: Object,
        observer: '_configObserver'
      },

      /**
       * Set is native iOs
       */
      isNativeIos: {
        type: Boolean,
        value: false
      },

      /**
       * Image shown in the banner
       */
      image: {
        type: Object,
        computed: '_computeImage(config)'
      },

      /**
       * Image top be shown when there is an error loading the image
       */
      defaultImage: {
        type: String
      },

      /**
       * Url for images location
       */
      imageLocation: {
        type: String,
        value: ''
      },

      /**
       * Check is the banner has image configured
       */
      _hasImage: {
        type: Boolean,
        computed: '_computeHasImage(config)'
      },

      /**
       * Hidden status
       */
      hidden: {
        type: Boolean,
        value: true,
        reflectToAttribute: true
      },

      /**
       * Type offer
       */
      bannerType: String,

      /**
       * ISO 4217 code for the location
       */
      localCurrency: String,

      /**
       * Format date of additional Info
       */
      formatDate: {
        type: String,
        value: 'DD/MM/YY'
      },

      /**
       * Locale for date, additional Info
       */
      localeDate: String,

      /**
       * Show days left
       */
      showDaysLeft: {
        type: Boolean,
        value: false
      },

      /**
       * Days left to finish the config
       */
      _daysLeft: {
        type: Boolean,
        value: false
      },

      /**
       * Message to show with _daysLeft
       */
      daysLeftMessage: String,

      /**
       * Hide close icon
       */
      noClose: {
        type: Boolean,
        value: false,
        reflectToAttribute: true
      },

      /**
       * Enables initial animation
       */
      stopped: {
        type: Boolean,
        value: false
      },

      /**
       * Animate banner
       */
      animated: {
        type: Boolean,
        value: false,
        observer: 'setAnimationClass'
      },

      /**
       * Show header
       * @type {Boolean}
       */
      showHeader: {
        type: Boolean,
        value: false,
        reflectToAttribute: true
      },

      _showTitle: {
        type: Boolean,
        value: false,
        computed: '_computeShowTitle(config)'
      },

      /**
       * Show Subheader if the property is actived (true)
       */
      showSubHeader: {
        type: Boolean,
        value: false,
        reflectToAttribute: true
      },

      closeAutomatically: Boolean,

      /**
       * Continue page
       */
      continue: String,

      /**
       * Banner link text
       */
      bannerLink: String,

      /**
       * Aria label banner link
       */
      ariaLabelBannerLink: String,

      /**
       * Card link text
       */
      cardLink: String,

      /**
       * Decimals hidden
       */
      decimalsHidden: {
        type: Boolean,
        value: false
      },

      /**
       * Clickable banner
       */
      clickableBanner: {
        type: Boolean,
        value: false,
        reflectToAttribute: true
      },

      /**
       * Close icon aria label
       */
      ariaLabelClose: {
        type: String,
        value: 'cells-oc-banner-close-icon-aria-label'
      },

      /**
       * Banner title class
       */
      bannerTitleClass: {
        type: String,
        value: 'banner__title'
      },
      /**
       * Amount class
       */
      amountClass: {
        type: String,
        value: 'amount-medium'
      },
      /**
       * Animate class
       */
      animatedClass: {
        type: String,
        value: 'animated'
      },
      /**
       * Last day message
       */
      lastDayMsg: {
        type: String,
        value: 'cells-oc-banner-last-day'
      },
      /**
       * One day message
       */
      oneDayLeftMsg: {
        type: String,
        value: 'cells-oc-banner-one-day-left'
      },
      /**
       * Several days left message
       */
      severalDaysLeftMsg: {
        type: String,
        value: 'cells-oc-banner-several-days-left'
      },
      /**
       * Valid until message
       */
      validUntilMsg: {
        type: String,
        value: 'cells-oc-banner-valid-until'
      },
      /**
       * Limited time message
       */
      limitedTimeMsg: {
        type: String,
        value: 'cells-oc-banner-limited-time'
      },
      /**
       * Icon blue banner card
       */
      isIconTitleDisabled: {
        type: Boolean,
        value: false
      },
      /**
       * Clickable banner to navigate
       */
      allAreaClickable: {
        type: Boolean,
        value: false
      },
      /**
       * custom route for glomo-navigation-handler
       */
      navigateTo: {
        type: String,
        value: ''
      },
      /**
       * navigate from the action
       */
      navigateFromAction: {
        type: Boolean,
        value: false
      }
    };
  }
  /**
  * Class to change the title color based on a status
  */
  _getTitleClass(status) {
    return `banner__title banner__title__${status}`;
  }

  /**
   * Class initialization
   */
  setAnimationClass() {
    if (this.animated) {
      this.classList.add(this.animatedClass);
      this.$.banner.classList.remove('banner-opened');
      this.$.banner.classList.add('banner-closed');
      if (!this.stopped) {
        this.openBanner();
      }
    } else {
      this.classList.remove(this.animatedClass);
      this.$.banner.classList.add('banner-opened');
      this.$.banner.classList.remove('banner-closed');
      this.$.collapse.opened = true;
    }
  }

  /**
   * Open the banner
   */
  openBanner() {
    this.$.banner.classList.add('banner-opened');
    this.$.banner.classList.remove('banner-closed');
    if (!this.$.collapse.opened) {
      this.$.collapse.noAnimation = !this.animated;
      this.$.collapse.toggle();
    }
  }

  /**
   * Banner close handler
   */
  _onClose() {
    if (this.closeAutomatically) {
      this.closeBanner();
    }
    this.dispatchEvent(new CustomEvent('cells-oc-banner-close', {
      detail: { offerId: (this.config || {}).offerId },
      bubbles: true,
      composed: true
    }));
  }

  /**
   * On tap banner button
   */
  _onBannerButton() {
    this.dispatchEvent(new CustomEvent('cells-oc-banner-button-event', {
      detail: this.config,
      bubbles: true,
      composed: true
    }));
  }

  /**
   * Close the banner
   */
  closeBanner() {
    this.$.banner.classList.remove('banner-opened');
    this.$.banner.classList.add('banner-closed');
    if (this.$.collapse.opened) {
      this.$.collapse.noAnimation = !this.animated;
      this.$.collapse.toggle();
    }
  }

  /**
   * Close the banner only if its empty
   * @param {Object} eventName
   */
  closeBannerIfEmpty() {
    const isBannerEmpty = !this.config;
    if (isBannerEmpty) {
      this.closeBanner();
    }
  }

  /**
   * Fire navigation event when action is clicked
   */
  _navigateFromAction() {
    const validId = this.config?.originalPayload?.origin?.id === 'ALT' || false;
    const productId = this.config?.product?.productId;
    const codes = {
      '00CB': '-consumer-loan',
      '0SKY': '-credit-card-holder'
    };
    const type = (validId && codes[productId]) || (this.bannerType ? `-${this.bannerType}` : '');
    this.dispatchEvent(new CustomEvent(`cells-oc-banner-click${type}`, {
      detail: {
        offerType: this.get('offerType.id', this.config),
        offerId: this.get('offerId', this.config),
        offerName: this.get('name', this.config),
        productId: this.get('product.contractId', this.config),
        productTypeId: this.get('product.productTypeId', this.config),
        subproductTypeId: this.get('product.subproductTypeId', this.config),
        amount: this.get('amount.amount', this.config),
        contractId: this.get('product.productId', this.config),
        tripId: this.get('tripId', this.config),
        link: this.get('link', this.config),
        originalProduct: this.config || {},
        continue: this.continue
      },
      bubbles: true,
      composed: true
    }));
    this.dispatchEvent(new CustomEvent('set-is-simulation-allowed', {
      detail: (this.config || {}).isSimulationAllowed,
      bubbles: true,
      composed: true
    }));
    this.dispatchEvent(new CustomEvent('set-is-improved', {
      detail: (this.config || {}).isImproved,
      bubbles: true,
      composed: true
    }));
    this.dispatchEvent(new CustomEvent('cells-oc-banner-displayed', {
      detail: {
        offerId: this.get('offerId', this.config),
      },
      bubbles: true,
      composed: true
    }));
    this.dispatchEvent(new CustomEvent('offer-tapped', {
      detail: this.get('originalPayload', this.config),
      bubbles: true,
      composed: true
    }));
    this.dispatchEvent(new CustomEvent('set-is-coming-soon', {
      detail: this.get('isComingSoon', this.config),
      bubbles: true,
      composed: true
    }));
  }

  /**
   * Sets the message for remaining days
   */
  _configObserver(config) {
    /* global moment */
    let today;
    let date;
    let diff;
    if (config.endDate) {
      if (this.showDaysLeft) {
        today = moment(new Date());
        date = moment(config.endDate);
        diff = date.diff(today, 'days');
      } else {
        diff = -1;
      }
      switch (diff) {
        case 0: {
          this._daysLeft = true;
          this.daysLeftMessage = this.t(this.lastDayMsg);
          break;
        }
        case 1: {
          this._daysLeft = true;
          this.daysLeftMessage = this.t(this.oneDayLeftMsg);
          break;
        }
        case 2:
        case 3: {
          this._daysLeft = true;
          this.daysLeftMessage = this.t(this.severalDaysLeftMsg, '', { days: diff });
          break;
        }
        default: {
          this._daysLeft = false;
          this.daysLeftMessage = this.t(this.validUntilMsg);
        }
      }
    } else {
      this._daysLeft = true;
      this.daysLeftMessage = this.t(this.limitedTimeMsg);
    }

    if (config && config.status) {
      this.bannerTitleClass = this._getTitleClass(config.status);
    }

    this._addConfig(config);
    this.set('hidden', false);
  }

  /**
   * Add configurations
   */
  _addConfig(config) {
    if (config) {
      if (config.offerType && config.offerType.id) {
        this.bannerType = config.offerType.id.toLowerCase().replace(/_/g, '-');
      }

      if (config.formatDate) {
        this.formatDate = config.formatDate;
      }

      if (config.bannerLink) {
        this.bannerLink = config.bannerLink;
      }

      if (config.ariaLabelBannerLink) {
        this.ariaLabelBannerLink = config.ariaLabelBannerLink;
      }

      if (config.cardLink) {
        this.cardLink = config.cardLink;
      }

      if (!this.noClose && config.ariaLabelClose) {
        this.ariaLabelClose = config.ariaLabelClose;
      }
    }
  }

  /**
   * Image computed
   */
  _computeImage(config) {
    const image = config.smallImg || { src: this.defaultImage };
    if (image.src) {
      image.url = this.imageLocation + image.src;
    }
    return image;
  }

  /**
   * hasImage computed
   */
  _computeHasImage(config) {
    if (this.defaultImage) {
      return true;
    }
    const image = config.smallImg || {};
    return Boolean(image.src || image.url);
  }

  /**
   * if hasn't header show Title
   */
  _computeShowTitle(config) {
    return !this.showHeader && config.title;
  }

  /**
   * Returns descriptive text for screen readers for amount
   */
  _computeScreenReaderDescriptionAmount({ amount, description }) {
    const amountDescription = this.get('description', amount);
    const amountCurrency = this.t(`cells-oc-banner-currency-${this.get('currency', amount)}`);
    const amountAmount = this.isNativeIos ? this.get('amount', amount).toLocaleString() : this.get('amount', amount);
    return this.t('cells-oc-banner-amount-description', '', {amountDescription, amountAmount, amountCurrency, description});
  }

  /**
   * Sets hidden text for screenreaders if description and amount are present
   */
  _computeDescriptionAriaHidden(config) {
    return (config.amount && config.description && !config.text);
  }

  /**
   * Image on error method
   */
  _onErrorImage() {
    if (this.config.smallImg.url !== this.defaultImage) {
      this.config.smallImg = { src: this.defaultImage };
      this.set('config', Object.assign({}, this.config));
    }
  }

  _onClickMain() {
    if (this.clickableBanner) {
      const type = this.bannerType ? this.bannerType : 'default';
      const detail =  this.navigateTo ?  {page: this.navigateTo} : {productId: this.get('product.contractId', this.config)};
      this._dispatchCustomEvent(`cells-oc-banner-main-click-${type}`, detail);
    }
    if (this.allAreaClickable) {
      this._navigateFromAction();
    }
  }

  /**
   * On navigate action button
   */
  _onNavigateFromAction() {
    if (!this.allAreaClickable || this.navigateFromAction) {
      this._navigateFromAction();
    }
  }

  /**
   * dispatch custom event
   * @param {String} eventName
   * @param {Object} detail
   */
  _dispatchCustomEvent(eventName, detail) {
    this.dispatchEvent(new CustomEvent(eventName, { detail, bubbles: true, composed: true }));
  }

}
window.customElements.define(CellsOcBanner.is, CellsOcBanner);
